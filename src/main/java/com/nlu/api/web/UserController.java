package com.nlu.api.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@GetMapping
	public ModelAndView getUserInfo(@RequestParam(value="roomId",required = false) Long roomId,@RequestParam(value="userId",required = false) Long userInf) {
		ModelAndView mav = new ModelAndView();
		if (roomId != null) {
			mav.setViewName("web/personal-inf");
		} else {
			mav.setViewName("web/user-inf");
		}
		return mav;
	}

}
