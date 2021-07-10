package com.nlu.api.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomDTO;
import com.nlu.repository.UserRepository;
import com.nlu.service.IRoomService;

@RestController(value = "homeAPI")
public class HomeAPI {

	@Autowired
	IRoomService roomService;

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/trang-chu")
	public ModelAndView homePage() {
		List<RoomDTO> rooms = this.roomService.findAll();
		ModelAndView mav = new ModelAndView("web/home");
		//System.out.println(this.userRepository.findOneByUsernameAndStatus("user", 1));
		mav.addObject("rooms", rooms);
		return mav;
	}

	@GetMapping(value = "/dang-nhap")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("web/login");
		return mav;
	}

	@GetMapping(value = "/thoat")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			System.out.println(new SecurityContextHolder().getContext().getAuthentication().getPrincipal());
		}
		return new ModelAndView("redirect:/trang-chu");
	}

	@GetMapping(value = "/accessDenied")
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/dang-nhap?accessDenied");
	}

}
