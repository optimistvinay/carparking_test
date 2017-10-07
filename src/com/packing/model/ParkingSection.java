package com.packing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARKING_SECTION")
public class ParkingSection {
	
	@Id
	@Column(name = "SECTION_ID", nullable = false)
	private String sectionId;
	

	@Column(name = "SECTION_NAME", nullable = false)
	private String sectionName;
	
	
	@Column(name = "NUMBER_OF_PARKING_SLOTS", nullable = false)
	private Integer numberOfParkingSlot;


	public String getSectionId() {
		return sectionId;
	}


	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}


	public String getSectionName() {
		return sectionName;
	}


	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}


	public Integer getNumberOfParkingSlot() {
		return numberOfParkingSlot;
	}


	public void setNumberOfParkingSlot(Integer numberOfParkingSlot) {
		this.numberOfParkingSlot = numberOfParkingSlot;
	}
	
	
	
	

}
