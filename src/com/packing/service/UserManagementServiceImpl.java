package com.packing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packing.controller.LoginUser;
import com.packing.model.MorningStarUser;
import com.packing.repository.UserRepository;
import com.packing.util.ParkingException;

@Service("userService")
@Transactional
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserRepository userRepository;
	
	public void RegisterUser(MorningStarUser user) {
		
		userRepository.registerUser(user);
	}

	public void login(LoginUser user) throws ParkingException {
		userRepository.login(user);
		
	}

}
