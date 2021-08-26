package com.nlu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.nlu.dto.OrderInfDTO;
import com.nlu.dto.RoomDTO;
import com.nlu.entity.CardEntity;
import com.nlu.entity.OrderEntity;
import com.nlu.payload.PersonalInfPayload;
import com.nlu.payload.MyData;
import com.nlu.payload.PaymentInfPayload;
import com.nlu.service.ICardService;
import com.nlu.service.IOrderService;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;
import com.nlu.util.DateProcess;

@Controller
@RequestMapping(value = "/booking")
public class BookinggController {
	@Autowired
	IRoomService roomService;
	@Autowired
	ICardService cardService;
	@Autowired
	IOrderService orderService;

	@GetMapping(value = "/booking-inf")
	public ModelAndView getBookingInf(@RequestParam(value = "roomId") Long roomId) {
		/* Find room with id */
		RoomDTO roomDTO = this.roomService.findOne(roomId);
		ModelAndView mav = new ModelAndView("web/booking-inf");
		mav.addObject("room", roomDTO);
		return mav;
	}

	@GetMapping(value = "/personal-inf")
	public ModelAndView getPersonalInf(@RequestParam(value = "roomId") Long roomId, Model model) {
		/* Find room with id */
		RoomDTO roomDTO = this.roomService.findOne(roomId);
		/* Create payload instance */
		PersonalInfPayload personalInfPayload = new PersonalInfPayload();
		PaymentInfPayload paymentInfPayload = new PaymentInfPayload();
		personalInfPayload.setRoomNumber(roomDTO.getNumber());
		personalInfPayload.setMaxCapacity(roomDTO.getMaxCapacity());
		/* add payload to Model */
		model.addAttribute("personalInfPayload", personalInfPayload);
		model.addAttribute("paymentInfPayload", paymentInfPayload);
		ModelAndView mav = new ModelAndView("web/personal-inf");
		mav.addObject("roomId", roomId);
		return mav;
	}

	@PostMapping(value = "/payment-inf")
	public ModelAndView postPaymentInf(@ModelAttribute("personalInfPayload") PersonalInfPayload personalInfPayload,
			@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam(value = "roomId") Long roomId) throws JsonProcessingException {
		/* Create Pending Order */
		OrderEntity order = new OrderEntity();
		order.setCustomerName(personalInfPayload.getName());
		order.setEmail(personalInfPayload.getName());
		order.setPhomeNumber(personalInfPayload.getPhomeNumber());
		order.setMaxCapacity(String.valueOf(personalInfPayload.getMaxCapacity()));
		order.setNote(personalInfPayload.getNote());
		order.setCmnd(personalInfPayload.getCmnd());
		order.setRoom(this.roomService.findOneEnttiy(roomId));
		order.setArrivalDate(personalInfPayload.getArrivalDate());
		order.setDepartureDate(personalInfPayload.getDepartureDate());
		ModelAndView mav = new ModelAndView("web/payment-inf");
		OrderEntity orderSaved = this.orderService.saveAndFush(order);
		mav.addObject("orderId", orderSaved.getId());
		return mav;
	}

	@PostMapping(value = "/booking-done")
	public ModelAndView getBookingDone(@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam Long orderId) {
		ModelAndView mav = null;
		if (paymentInfPayload.getCardHolderName().equals("HUYNH GIA HUY")
				&& paymentInfPayload.getCardNumber().equals("444 555 666 777")
				&& paymentInfPayload.getPassword().equals("123")) {
			System.out.println(true);
			/* Create and save card when payment step is completed */
			CardEntity cardEntity = new CardEntity();
			cardEntity.setCardHolderName(paymentInfPayload.getCardHolderName());
			cardEntity.setCardNumber(paymentInfPayload.getCardNumber());
			cardEntity.setExpriedTime(paymentInfPayload.getExpriedTime());
			CardEntity cardSaved = cardService.saveAndFush(cardEntity);
			/* Get order with Id to add card */
			OrderEntity order = this.orderService.findOneById(orderId);
			order.setCard(cardSaved);
			/* Resave order */
			this.orderService.saveAndFush(order);
			mav = new ModelAndView("web/booking-done");
			/* Setup info to send to view */
			OrderInfDTO orderDTO = new OrderInfDTO();
			orderDTO.setCapacity(order.getMaxCapacity());
			orderDTO.setPrice((int) order.getRoom().getType().getPrice());
			/* Compute stay date */
			long stayDate = DateProcess.daysBetween2Dates(order.getArrivalDate(), order.getDepartureDate());
			orderDTO.setStayNumber((int) stayDate);
			orderDTO.setSubTotal((int) (orderDTO.getPrice() * stayDate));
			/* Compute temp tax */
			if (orderDTO.getSubTotal() > 500000) {
				orderDTO.setTaxPercent(5);
			} else {
				orderDTO.setTaxPercent(0);
			}
			orderDTO.setTaxPrice((orderDTO.getSubTotal() * orderDTO.getTaxPercent()) / 100);
			orderDTO.setTotalPrice(orderDTO.getSubTotal() + orderDTO.getTaxPrice());
			mav.addObject("orderInf", orderDTO);
			return mav;
		} else {
			System.out.println(false);
			mav = new ModelAndView("web/payment-inf");
			mav.addObject("orderId", orderId);
			mav.addObject("paymentFail", true);
			return mav;
		}
	}
}
