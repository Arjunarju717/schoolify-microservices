package com.schoolify.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolify.configuration.model.MemberProfileConfiguration;

@RestController
public class ConfigurationController {
	
	@Autowired
	private MemberProfileConfiguration memberProfileConfiguration;
	
	@GetMapping("getConfigDetails")
	public MemberProfileConfiguration getConfigurationDetails() {
		return memberProfileConfiguration;
	}

}
