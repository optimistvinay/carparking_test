package com.packing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {
	
	@RequestMapping(value= "/checkin")
	public void register(@RequestParam(value = "parkingSlot",required = false,
            defaultValue = "0") String parkingSlot){
		System.out.println("parkingSlot : " + parkingSlot);
	}
	
	
}
