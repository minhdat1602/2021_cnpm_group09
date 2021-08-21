package com.nlu.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.entity.RoomTypeEntity;
import com.nlu.service.IRoomTypeService;

@Controller
public class SearchController2 {

	@Autowired
	private IRoomTypeService service;

	@GetMapping(value = "/tim-kiem")
	public ModelAndView findByKey(@RequestParam String key) {
		ModelAndView mav = new ModelAndView("web/our_room2");
		
		List<RoomTypeEntity> listRoom = service.findByKey(key);
		mav.addObject("listRoom", listRoom);

		return mav;
	}
}
