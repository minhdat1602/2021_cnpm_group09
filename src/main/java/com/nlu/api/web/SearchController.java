package com.nlu.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.RoomTypeEntity;
import com.nlu.payload.request.FilterRequest;
import com.nlu.payload.response.MessageResponse;
import com.nlu.payload.response.SearchResponse;
import com.nlu.service.IRoomTypeService;

@RestController
public class SearchController {

	@Autowired
	private IRoomTypeService roomTypeService;

	@GetMapping("/search")
	public ResponseEntity<?> getByFilter(@ModelAttribute FilterRequest filterRequest) {

		if (filterRequest.getAdult() == null || filterRequest.getChildren() == null
				|| filterRequest.getRoomNum() == null || filterRequest.getEndDate() == null
				|| filterRequest.getEndDate() == null) {
			System.out.println(filterRequest.getAdult());
			if (filterRequest.getEndDate() == null)
				System.out.println("startDate");
			if (filterRequest.getEndDate() == null)
				System.out.println("endDate");
			return ResponseEntity.badRequest().body(new MessageResponse("invalid data"));
		}

		if (filterRequest.getStartDate().compareTo(filterRequest.getEndDate()) >= 0) {
			return ResponseEntity.badRequest().body(new MessageResponse("invalid date"));
		}

		int capacity = filterRequest.getAdult() + filterRequest.getChildren() / 2;

		List<RoomTypeDTO> listRoomType = roomTypeService.getByFilter(capacity, filterRequest.getRoomNum(),
				filterRequest.getStartDate(), filterRequest.getEndDate());

		SearchResponse response = new SearchResponse();

		response.setListRoomType(listRoomType);

		return ResponseEntity.ok(response);

	}
	
	@GetMapping(value = "/tim-kiem")
	public ModelAndView findByKey(@RequestParam String key) {
		ModelAndView mav = new ModelAndView("web/our_room2");
		
		List<RoomTypeEntity> listRoom = roomTypeService.findByKey(key);
		mav.addObject("listRoom", listRoom);

		return mav;
	}

}
