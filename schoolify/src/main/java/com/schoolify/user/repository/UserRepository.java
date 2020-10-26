package com.schoolify.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolify.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
