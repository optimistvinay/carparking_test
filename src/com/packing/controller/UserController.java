package com.packing.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packing.model.MorningStarUser;
import com.packing.service.EmployeeService;
import com.packing.service.UserManagementService;
import com.packing.util.ParkingException;

@RestController
public class UserController {
	
//	@Autowired
//	private UserService userService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired 
	private UserManagementService userService;

	@RequestMapping(value= "/users/register", method = RequestMethod.POST)
	public void register(@RequestBody MorningStarUser user){
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		userService.RegisterUser(user);
//		userService.registerUser(person);
	}
	
	@RequestMapping(value= "/users/updateCar")
	public void updateCar(@RequestParam(value = "id",required = false,
            defaultValue = "0") String carNumber){
		System.out.println("carNUmber : " + carNumber);
		
		MorningStarUser user = new MorningStarUser();
		user.setFirstName("Vinayak");
		user.setLastName("Sawant");
		user.setCarNumber("1234");
		user.setDept("IT");
		user.setEmail("v.s@gmail.com");
		user.setPassword("India");
		userService.RegisterUser(user);
		
//		Employee employee = new Employee();
//		employee.setName("Vinayak");
//		employeeService.saveEmployee(employee);
	}
	
	
	@RequestMapping(value= "/users/login", method = RequestMethod.POST)
	public ResponseEntity<LoginResponse> login(@RequestBody LoginUser loginUser){
		System.out.println("email : " + loginUser.getEmail());
		System.out.println("PassWord : " + loginUser.getPassword());
		try {
			userService.login(loginUser);
			LoginResponse loginResponse = new LoginResponse();
			loginResponse.setMessage("Sucussful login !!!!!");
			HttpHeaders headers = new HttpHeaders();
			headers.add("authtoken", loginUser.getEmail() + "1234");
			ResponseEntity<LoginResponse> response = new ResponseEntity<LoginResponse>(loginResponse, headers, HttpStatus.OK);
			return response;
		} catch (ParkingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LoginResponse loginResponse = new LoginResponse();
			loginResponse.setMessage(e.getErrorMessage()+" !!!!!");
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("error--code", "456");
			headers.add("error-text", e.getErrorMessage());
			ResponseEntity<LoginResponse> response = new ResponseEntity<LoginResponse>(loginResponse, headers, HttpStatus.BAD_REQUEST);
			return response;
		}
		
	}
	
}
