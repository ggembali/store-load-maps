package info.ganesh.service;

import info.ganesh.domain.Bill;

public abstract class PercentageDiscount extends BillDiscount {
	private int discountPercentage;

	public PercentageDiscount(int discountPercentage) {
		super();
		this.discountPercentage = discountPercentage;
	}

	@Override
	public double calculateDiscount(Bill bill) {
		double totalBill = BillAmountCalculationUtil.getTotalNonGroceryItemsBilledAmount(bill);
		return (totalBill * discountPercentage) / 100;
	}

}
