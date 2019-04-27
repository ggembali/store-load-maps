package info.ganesh.service;

import info.ganesh.domain.Affiliate;
import info.ganesh.domain.Bill;

public class AffiliateDiscount extends PercentageDiscount {

	public AffiliateDiscount(int discountPercentage) {
		super(discountPercentage);
	}

	@Override
	public boolean isApplicable(Bill bill) {
		return bill.getUser() instanceof Affiliate;
	}

}
