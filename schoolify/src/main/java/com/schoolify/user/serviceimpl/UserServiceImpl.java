package com.schoolify.user.serviceimpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolify.user.dto.UserDTO;
import com.schoolify.user.model.User;
import com.schoolify.user.repository.UserRepository;
import com.schoolify.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);
		user = userRepository.save(user);
		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	@Override
	public UserDTO findUserById(Integer id) {
		Optional<User> userOptional = userRepository.findById(id);
		if(userOptional.isPresent()) {
			User user = userOptional.get();
			return modelMapper.map(user, UserDTO.class);
		}
		return null;
	}

}
