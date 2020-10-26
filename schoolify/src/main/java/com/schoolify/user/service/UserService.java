package com.schoolify.user.service;

import com.schoolify.user.dto.UserDTO;

public interface UserService {
	
	public UserDTO saveUser(UserDTO userDTO);
	
	public UserDTO findUserById(Integer id);

}
