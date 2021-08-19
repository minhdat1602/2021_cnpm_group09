package com.nlu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomDTO;
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
//		return mav;
//	}
}
