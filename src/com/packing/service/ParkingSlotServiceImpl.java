package com.packing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packing.model.ParkingLot;
import com.packing.model.ParkingSection;
import com.packing.repository.ParkingSlotRepository;


@Service("parkingSlotService")
@Transactional
public class ParkingSlotServiceImpl implements ParkingSlotService {
	
	@Autowired
	private ParkingSlotRepository parkingSlotRepository;

	public List<ParkingSection> getAllParkingSection() {
		return parkingSlotRepository.getAllParkingSection();
	}

	public List<ParkingLot> getParkingLotsForSection(String sectionId) {
		return parkingSlotRepository.getParkingLotsForSection(sectionId);
	}

}
