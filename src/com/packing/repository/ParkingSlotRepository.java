package com.packing.repository;

import java.util.List;

import com.packing.model.ParkingLot;
import com.packing.model.ParkingSection;

public interface ParkingSlotRepository {

	
	public List<ParkingSection> getAllParkingSection();

	public List<ParkingLot> getParkingLotsForSection(String sectionId);
}
