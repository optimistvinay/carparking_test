package com.packing.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="PARKING_LOT")
public class ParkingLot {

	
	@Id
	@Column(name = "PARKING_LOT_ID", nullable = false)
	private String parkingLotId;
	
	@Column(name = "PARKING_LOT_NAME", nullable = false)
	private String parkingLotName;
	

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SECTION_ID")
	private ParkingSection parkingSection;
    
    @Column(name= "AVAILABLE")
    private Boolean available;


	public String getParkingLotId() {
		return parkingLotId;
	}


	public void setParkingLotId(String parkingLotId) {
		this.parkingLotId = parkingLotId;
	}


	public String getParkingLotName() {
		return parkingLotName;
	}


	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}


	public ParkingSection getParkingSection() {
		return parkingSection;
	}


	public void setParkingSection(ParkingSection parkingSection) {
		this.parkingSection = parkingSection;
	}


	public Boolean getAvailable() {
		return available;
	}


	public void setAvailable(Boolean available) {
		this.available = available;
	}
    
    
	
	
}
