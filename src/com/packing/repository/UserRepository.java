package com.packing.repository;

import com.packing.controller.LoginUser;
import com.packing.model.MorningStarUser;
import com.packing.util.ParkingException;

public interface UserRepository {
	
	void registerUser(MorningStarUser user);
	
	void login(LoginUser user) throws ParkingException;

}
