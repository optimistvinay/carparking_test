package com.packing.service;

import com.packing.controller.LoginUser;
import com.packing.model.MorningStarUser;
import com.packing.util.ParkingException;

public interface UserManagementService {
	
	void RegisterUser(MorningStarUser user);
	
	void login(LoginUser user) throws ParkingException; 

}
