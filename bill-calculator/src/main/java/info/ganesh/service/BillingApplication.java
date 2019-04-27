package info.ganesh.service;

import java.util.Arrays;
import java.util.List;

public class BillingApplication {
	private BillingService billingService;

	public void init() {
		List<PercentageDiscount> percentageDiscounts = Arrays.asList(new EmployeeDiscount(30),
				new AffiliateDiscount(10), new LoyaltyDiscount(5));
		List<PerSlabDiscount> otherDiscounts = Arrays.asList(new PerSlabDiscount(100,5));
		billingService = new BillingService(percentageDiscounts, otherDiscounts);

	}
	
	public BillingService getBillingService() {
		return billingService;
	}

}
