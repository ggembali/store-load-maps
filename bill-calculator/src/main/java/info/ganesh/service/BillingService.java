package info.ganesh.service;

import java.util.List;

import info.ganesh.domain.Bill;
import info.ganesh.domain.BillReceipt;

public class BillingService {
	private List<PercentageDiscount> percentageDiscounts;
	private List<? extends BillDiscount> discounts;

	public BillingService(List<PercentageDiscount> percentageDiscounts, List<? extends BillDiscount> discounts) {
		super();
		this.percentageDiscounts = percentageDiscounts;
		this.discounts = discounts;
	}

	public BillReceipt calculateNetPayableBill(Bill bill) {
		double maxPercentageDiscount = 0;
		for (PercentageDiscount percentageDiscount : percentageDiscounts) {
			double applicableDiscount = percentageDiscount.applicableDiscount(bill);
			if (applicableDiscount > maxPercentageDiscount) {
				maxPercentageDiscount = applicableDiscount;
			}
		}

		double totalDiscount = maxPercentageDiscount;

		for (BillDiscount billDiscount : discounts) {
			totalDiscount += billDiscount.applicableDiscount(bill);
		}
		double totalBilledAmount = BillAmountCalculationUtil.getTotalBilledAmount(bill);
		return new BillReceipt(bill, totalBilledAmount - totalDiscount, totalBilledAmount);

	}

}
