package com.nlu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomDTO;
import com.nlu.entity.CardEntity;
import com.nlu.entity.OrderEntity;
import com.nlu.entity.RoomEntity;
import com.nlu.payload.BookingPayload;
import com.nlu.payload.PaymentInfPayload;
import com.nlu.service.ICardService;
import com.nlu.service.IOrderService;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@Controller
@RequestMapping(value = "/booking")
public class BookinggController {

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
		System.out.println(bookingPayload);
		return mav;
	}

	@PostMapping(value = "/payment-inf")
	public ModelAndView postPaymentInf(@ModelAttribute("bookingPayload") BookingPayload bookingPayload,
			@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam(value = "roomId") Long roomId) {
		System.out.println(bookingPayload);
		ModelAndView mav = new ModelAndView("web/payment-inf");
		mav.addObject("roomId", roomId);
		mav.addObject("bookingPayload", bookingPayload);
		return mav;
	}

	@PostMapping(value = "/booking-done")
	public ModelAndView getBookingDone(@ModelAttribute("bookingPayload") BookingPayload bookingPayload,
			@ModelAttribute("paymentInfPayload") PaymentInfPayload paymentInfPayload,
			@RequestParam(value = "roomId") Long roomId, Model model) {
		RoomEntity roomEntity = this.roomService.findOneEnttiy(roomId);
		CardEntity cardEntity = new CardEntity();
		cardEntity.setCardHolderName(paymentInfPayload.getCardHolderName());
		cardEntity.setCardNumber(paymentInfPayload.getCardNumber());
		cardEntity.setExpriedTime(paymentInfPayload.getExpriedTime());
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setCustomerName(bookingPayload.getName());
		orderEntity.setEmail(bookingPayload.getEmail());
		orderEntity.setMaxCapacity(String.valueOf(bookingPayload.getMaxCapacity()));
		orderEntity.setNote(bookingPayload.getNote());
		orderEntity.setPhomeNumber(bookingPayload.getPhoneNumber());
		orderEntity.setCard(cardEntity);
		orderEntity.setRoom(roomEntity);
		this.cardService.saveAndFush(cardEntity);
		this.orderService.saveAndFush(orderEntity);
		ModelAndView mav = new ModelAndView("web/booking-done");
		return mav;
	}
}
