package com.nlu.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/booking-room")
public class PaymentController {
	@RequestMapping(value = "/dat-phong", method = RequestMethod.GET)
	public ModelAndView getBookingInf() {
		ModelAndView mav = new ModelAndView("web/booking-inf");
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
