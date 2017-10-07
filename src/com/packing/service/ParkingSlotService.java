package com.packing.service;

import java.util.List;

import com.packing.model.ParkingLot;
import com.packing.model.ParkingSection;

public interface ParkingSlotService {
	
	public List<ParkingSection> getAllParkingSection();

	public List<ParkingLot> getParkingLotsForSection(String sectionId);

}
