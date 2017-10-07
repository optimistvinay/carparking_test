package com.packing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packing.model.ParkingLot;
import com.packing.model.ParkingSection;
import com.packing.service.ParkingSlotService;

@RestController
public class ParkingSlotController {

	@Autowired
	private ParkingSlotService parkingSlotService;
	
	@RequestMapping(value= "/parking/sections", method = RequestMethod.GET)
	public ResponseEntity<List<ParkingSection>> getAllParkingSection(){
		
		List<ParkingSection> list = parkingSlotService.getAllParkingSection();
		
		ResponseEntity<List<ParkingSection>> response = new ResponseEntity<List<ParkingSection>>(list, HttpStatus.OK);
		
		return response;
	}
	
	
	@RequestMapping(value= "/parking/slots/{sectionId}", method = RequestMethod.GET)
	public ResponseEntity<List<ParkingLot>> getParkingSlotForSection(@PathVariable String sectionId){
		
		List<ParkingLot> list = parkingSlotService.getParkingLotsForSection(sectionId);
		
		ResponseEntity<List<ParkingLot>> response = new ResponseEntity<List<ParkingLot>>(list, HttpStatus.OK);
		
		return response;
	}
	
	
}
