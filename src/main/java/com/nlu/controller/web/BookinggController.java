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
import com.nlu.dto.RoomDTO;
import com.nlu.entity.CardEntity;
import com.nlu.entity.OrderEntity;
import com.nlu.payload.BookingPayload;
import com.nlu.payload.MyData;
import com.nlu.payload.PaymentInfPayload;
import com.nlu.service.ICardService;
import com.nlu.service.IOrderService;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@Controller
@RequestMapping(value = "/booking")
public class BookinggController {

//	@Autowired
//	IRoomService roomService;
//	@Autowired
//	IRoomTypeService roomTypeService;
//	
//	@GetMapping()
//	public ModelAndView getBookingInf(@RequestParam(value = "roomId") Long roomId) {
//		RoomDTO roomDTO = this.roomService.findOne(roomId);
//		ModelAndView mav = new ModelAndView("web/booking-inf");
//		mav.addObject("room", roomDTO);
	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomTypeService roomTypeService;
	@Autowired
	ICardService cardService;
	@Autowired
	IOrderService orderService;

	@GetMapping(value = "/booking-inf")
	public ModelAndView getBookingInf(@RequestParam(value = "roomId") Long roomId) {
		RoomDTO roomDTO = this.roomService.findOne(roomId);
		ModelAndView mav = new ModelAndView("web/booking-inf");
		mav.addObject("room", roomDTO);
		return mav;
	}

	@GetMapping(value = "/personal-inf")
	public ModelAndView getPersonalInf(@RequestParam(value = "roomId") Long roomId, Model model) {
		RoomDTO roomDTO = this.roomService.findOne(roomId);
		BookingPayload bookingPayload = new BookingPayload();
		PaymentInfPayload paymentInfPayload = new PaymentInfPayload();
		bookingPayload.setRoomNumber(roomDTO.getNumber());
		bookingPayload.setMaxCapacity(roomDTO.getMaxCapacity());
		model.addAttribute("bookingPayload", bookingPayload);
		model.addAttribute("paymentInfPayload", paymentInfPayload);
		ModelAndView mav = new ModelAndView("web/personal-inf");
		mav.addObject("roomId", roomId);
		System.out.println("OK " + bookingPayload);
		System.out.println("ABC");
		System.out.println(model.asMap());
		return mav;
	}

	@PostMapping(value = "/payment-inf")
	public ModelAndView postPaymentInf(@ModelAttribute("bookingPayload") BookingPayload bookingPayload,
			@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam(value = "roomId") Long roomId, Model model) throws JsonProcessingException {
		OrderEntity order = new OrderEntity();
		order.setCustomerName(bookingPayload.getName());
		order.setEmail(bookingPayload.getName());
		order.setMaxCapacity(String.valueOf(bookingPayload.getMaxCapacity()));
		order.setNote(bookingPayload.getNote());
		order.setPhomeNumber(bookingPayload.getPhoneNumber());
		order.setRoom(this.roomService.findOneEnttiy(roomId));
		ModelAndView mav = new ModelAndView("web/payment-inf");
		OrderEntity orderSaved = this.orderService.saveAndFush(order);
		mav.addObject("orderId", orderSaved.getId());
		return mav;
	}

	@PostMapping(value = "/booking-done")
	public ModelAndView getBookingDone(@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam Long orderId) {
		CardEntity cardEntity = new CardEntity();
		cardEntity.setCardHolderName(paymentInfPayload.getCardHolderName());
		cardEntity.setCardNumber(paymentInfPayload.getCardNumber());
		cardEntity.setExpriedTime(paymentInfPayload.getExpriedTime());
		CardEntity cardSaved = cardService.saveAndFush(cardEntity);
		OrderEntity order = this.orderService.findOneById(orderId);
		order.setCard(cardSaved);
		this.orderService.saveAndFush(order);
		ModelAndView mav = new ModelAndView("web/booking-done");
		return mav;
	}
}
