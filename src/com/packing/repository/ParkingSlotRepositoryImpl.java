package com.packing.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.packing.model.ParkingLot;
import com.packing.model.ParkingSection;

@Repository("parkingSlotRepository")
public class ParkingSlotRepositoryImpl extends AbstractDao implements ParkingSlotRepository {

	public List<ParkingSection> getAllParkingSection() {
		
		
//		List<ParkingLot> list = getSession().createQuery("from ParkingLot").list();
		
		return getSession().createQuery("from ParkingSection").list();
	}

	public List<ParkingLot> getParkingLotsForSection(String sectionId) {
		Criteria criteria = getSession().createCriteria(ParkingLot.class,"parkingLot")
			    .createAlias("parkingLot.parkingSection","parkingSection")
			    .add(Restrictions.eq("parkingSection.sectionId", sectionId));
			    List<ParkingLot> list1 = criteria.list();
		return list1;
	}

}
