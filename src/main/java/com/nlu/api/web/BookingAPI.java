package com.nlu.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@RestController
public class BookingAPI {

	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomTypeService roomTypeService;

//	@PostMapping("api/booking")
//	public ModelAndView getBookingInf(@RequestParam(value = "id") Long id) {
//		ModelAndView mav = new ModelAndView("web/booking-inf");
//		RoomDTO roomDTO = roomService.findOne(id);
//		RoomTypeDTO roomTypeDTO = roomTypeService.findOne(roomDTO.getRoomTypeId());
//		Set<ConvenientDTO> covenients = roomTypeDTO.getConvenients();
//		System.out.println(covenients);
//		mav.addObject("room", roomDTO);
//		mav.addObject("roomType", roomTypeDTO);
//		mav.addObject("covenients", covenients);
//		return mav;
//	}
}
