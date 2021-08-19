package com.nlu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomDTO;
import com.nlu.payload.BookingPayload;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@Controller
@RequestMapping(value = "/booking")
public class BookinggController {

	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomTypeService roomTypeService;

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
		bookingPayload.setRoomNumber(roomDTO.getNumber());
		bookingPayload.setMaxCapacity(roomDTO.getMaxCapacity());
		model.addAttribute("bookingPayload", bookingPayload);
		ModelAndView mav = new ModelAndView("web/personal-inf");
		mav.addObject("roomId", roomId);
		System.out.println(bookingPayload);
		return mav;
	}

	@PostMapping(value = "/payment-inf")
	public ModelAndView postPaymentInf(@ModelAttribute("bookingPayload") BookingPayload bookingPayload, Model model) {
		System.out.println(bookingPayload);
		ModelAndView mav = new ModelAndView("web/payment-inf");
		mav.addObject("bookingPayload", bookingPayload);
		return mav;
	}

//	@PostMapping(value = "/booking-done")
//	public ModelAndView getBookingDone(@ModelAttribute("bookingPayload") BookingPayload bookingPayload, Model model) {
//		System.out.println(bookingPayload);
//		System.out.println(model);
//		ModelAndView mav = new ModelAndView("web/payment-inf");
//		mav.addObject("bookingPayload", bookingPayload);
//		return mav;
//	}
}
