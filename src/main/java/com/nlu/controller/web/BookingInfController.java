package com.nlu.controller.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.ConvenientDTO;
import com.nlu.dto.RoomDTO;
import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.ConvenientEntity;
import com.nlu.entity.RoomEntity;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@Controller
@RequestMapping(value = "/booking-room")
public class BookingInfController {
	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomTypeService roomTypeService;

	@RequestMapping(value = "/dat-phong", method = RequestMethod.GET)
	public ModelAndView getBookingInf(@RequestParam(value = "id") Long id) {
		ModelAndView mav = new ModelAndView("web/booking-inf");
		RoomDTO roomDTO = roomService.findOne(id);
		RoomTypeDTO roomTypeDTO = roomTypeService.findOne(roomDTO.getRoomTypeId());
		Set<ConvenientDTO> covenients = roomTypeDTO.getConvenients();
		System.out.println(covenients);
		mav.addObject("room", roomDTO);
		mav.addObject("roomType", roomTypeDTO);
		mav.addObject("conveniences", covenients);
		return mav;
	}

	@RequestMapping(value = "/thong-tin-khach-hang", method = RequestMethod.GET)
	public ModelAndView getPersonalInf() {
		ModelAndView mav = new ModelAndView("web/personal-inf");
		return mav;
	}

	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public ModelAndView getPaymentInf() {
		ModelAndView mav = new ModelAndView("web/payment-inf");
		return mav;
	}

	@RequestMapping(value = "/done", method = RequestMethod.GET)
	public ModelAndView getDont() {
		ModelAndView mav = new ModelAndView("web/booking-done");
		return mav;
	}
}
