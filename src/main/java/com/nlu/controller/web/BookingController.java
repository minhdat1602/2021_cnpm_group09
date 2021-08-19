package com.nlu.controller.web;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomDTO;
import com.nlu.entity.BookingEntity;
import com.nlu.entity.RoomTypeEntity;
import com.nlu.payload.request.BookingInfoRequest;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;
import com.nlu.service.impl.BookingService;
import com.nlu.service.impl.RoomTypeService;

@Controller
public class BookingController {

	@Autowired
	private RoomTypeService roomTypeService;

	@Autowired
	private BookingService bookingService;

	@GetMapping("/dat-phong")
	public ModelAndView getBook(@RequestParam(name = "id") long id) {
		ModelAndView mav = new ModelAndView("web/booking");
		RoomTypeEntity roomType = roomTypeService.findById(id);
		mav.addObject("roomType", roomType);
		return mav;
	}

	@PostMapping("/dat-phong")
	public ModelAndView booking(@ModelAttribute BookingInfoRequest bookingInfoRequest) {
		ModelAndView mav = new ModelAndView("web/booking_done");
		try {
			System.out.println(bookingInfoRequest.getPrice());
			BookingEntity booking = bookingService.save(bookingInfoRequest);
			System.out.println(bookingInfoRequest.getPrice());
			mav.addObject("booking", booking);
			mav.addObject("requestObj", bookingInfoRequest);

			long diff = bookingInfoRequest.getEndDate().getTime() - bookingInfoRequest.getStartDate().getTime();

			long diffrence = diff / (1000 * 60 * 60 * 24);
			mav.addObject("day", diffrence);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mav;
	}
	
	@Autowired
	IRoomService roomService;
}
