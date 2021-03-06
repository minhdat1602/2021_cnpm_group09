package com.nlu.service;

import com.nlu.dto.UserDTO;

public interface IUserService {
	UserDTO save(UserDTO userDTO);

	boolean existEmail(String email);

	boolean existUsername(String username);

	boolean checkPassword(String username, String password);

	UserDTO findOne(Long id);
	
}
