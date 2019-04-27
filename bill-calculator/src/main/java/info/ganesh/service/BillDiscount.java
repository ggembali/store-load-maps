package info.ganesh.service;

import info.ganesh.domain.Bill;

public abstract class BillDiscount {
	
	public double applicableDiscount(Bill bill){
		if(isApplicable(bill)) {
			return calculateDiscount(bill);
		}
		return 0;
	}
	
	public abstract double calculateDiscount(Bill bill);
	
	public abstract boolean isApplicable(Bill bill);

}
