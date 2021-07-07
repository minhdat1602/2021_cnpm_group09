package com.nlu.api.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.ConvenientDTO;
import com.nlu.dto.RoomDTO;
import com.nlu.dto.RoomTypeDTO;
import com.nlu.service.IRoomService;
import com.nlu.service.IRoomTypeService;

@RestController
public class BookingAPI {

	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomTypeService roomTypeService;

	@PostMapping("api/thong-tin-khach-hang")
	public ModelAndView getPersonalInf(@RequestParam(value = "id") Long id) {
		ModelAndView mav = new ModelAndView("web/personal-inf");
		return mav;
	}
}
