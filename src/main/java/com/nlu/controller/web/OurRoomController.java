package com.nlu.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/phong-trong")
public class OurRoomController {
	@GetMapping()
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/our_room");
		return mav;
	}
}
