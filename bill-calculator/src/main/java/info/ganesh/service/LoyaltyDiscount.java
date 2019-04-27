package info.ganesh.service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import info.ganesh.domain.Bill;

public class LoyaltyDiscount extends PercentageDiscount {


	public LoyaltyDiscount(int discountPercentage) {
		super(discountPercentage);
	}

	@Override
	public boolean isApplicable(Bill bill) {
	    long diffInMillies = Math.abs(bill.getUser().getRegisteredDate().getTime() - new Date().getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
	    //Leap year scenario would fail here
		return diff > 2*365;
	}

}
