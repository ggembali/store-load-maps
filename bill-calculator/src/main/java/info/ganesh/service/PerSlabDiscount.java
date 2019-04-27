package info.ganesh.service;

import info.ganesh.domain.Bill;

public class PerSlabDiscount extends BillDiscount {
	private int slabSize;
	private int discount;
	

	public PerSlabDiscount(int slabSize,int discount) {
		super();
		this.slabSize = slabSize;
		this.discount = discount;
	}

	@Override
	public double calculateDiscount(Bill bill) {
		return (BillAmountCalculationUtil.getTotalBilledAmount(bill) % slabSize) * discount;
	}

	@Override
	public boolean isApplicable(Bill bill) {
		return true;
	}

}
