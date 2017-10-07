package com.packing.repository;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;

import com.packing.controller.LoginUser;
import com.packing.model.MorningStarUser;
import com.packing.util.ParkingException;


@Repository("userRepository")
public class UserRepositoryImpl extends AbstractDao implements UserRepository{

	public void registerUser(MorningStarUser user) {
		try{
			persist(user);
		}
		catch(Exception  ex){
			System.out.println("Issue with inserting data !!!!!!");
	          
		}
		
	}

	public void login(LoginUser user) throws ParkingException{
		MorningStarUser mstarUser = (MorningStarUser)getSession().get(MorningStarUser.class, user.getEmail());
		if(mstarUser != null){
			if(mstarUser.getPassword().equalsIgnoreCase(user.getPassword())){
				System.out.println("Valid user");
			}
			else{
				System.out.println("Invalid User");
				throw new ParkingException("Incorrect credentails");
			}
		}
		else{
			System.out.println("Invalid User");
			throw new ParkingException("Incorrect credentails");
		}
		
		
	}


}
