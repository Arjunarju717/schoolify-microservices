package com.schoolify.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolify.user.dto.UserDTO;
import com.schoolify.user.service.UserService;

@RestController
public class CommonController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("hello")
	public String hello() {
		return "Hello Arjun";
	}
		
	@PostMapping("saveUser")
	public UserDTO saveUser(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO);
	}
	
	@GetMapping("findUserById")
	public ResponseEntity<UserDTO> findUserById(@RequestParam int id) {
		UserDTO userDTO = userService.findUserById(id);
		if (null == userDTO) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(userDTO);
		}
	}

}
