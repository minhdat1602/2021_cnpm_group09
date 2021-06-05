package com.nlu.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.UserDTO;
import com.nlu.service.IUserService;

@RestController(value = "userAPI")
public class UserAPI {
	@Autowired
	private IUserService userService;
	
	@GetMapping(value = "/thay-doi-thong-tin")
	public ModelAndView updatePage(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("web/change-information");
		UserDTO userDTO = userService.findOne(id);
		mav.addObject("model", userDTO);
		return mav;
	}
	
	@GetMapping(value = "/dang-ky")
	public ModelAndView registerPage() {
		ModelAndView mav = new ModelAndView("web/register");
		UserDTO userDTO = new UserDTO();
		mav.addObject("model", userDTO);
		return mav;
	}
	
//	@PostMapping(value = "/api/user")
//	@Transactional
//	public ResponseEntity<?> register(@RequestBody UserDTO userDTO) {
//		if (userService.existEmail(userDTO.getEmail())) {
//			return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
//		}
//		if (userService.existUsername(userDTO.getUsername())) {
//			return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already in use!"));
//		}
//		userService.save(userDTO);
//		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
//	}
//	
//	@PutMapping(value = "/api/user")
//	@Transactional
//	public ResponseEntity<?> update(@RequestBody UserDTO userDTO) {
//		if (!userService.checkPassword(userDTO.getUsername(), userDTO.getPassword())) {
//			return ResponseEntity.badRequest().body(new MessageResponse("Error: Password incorrect!"));
//		}
//		
//		if (userService.save(userDTO) == null) {
//			return ResponseEntity.badRequest().body(new MessageResponse("Error: System Error!"));
//		}
//		return ResponseEntity.ok(new MessageResponse("Cập nhật thành công!"));
//	}
	
}
