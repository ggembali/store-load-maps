package info.ganesh.service;

import java.util.Iterator;

import info.ganesh.domain.Bill;
import info.ganesh.domain.BillItem;
import info.ganesh.domain.ItemType;

public class BillAmountCalculationUtil {

	public static double getTotalBilledAmount(Bill bill) {
		double totalBill = 0;
		for (Iterator iterator = bill.getItems().iterator(); iterator.hasNext();) {
			BillItem billItem = (BillItem) iterator.next();
			totalBill += billItem.getQuantity() * billItem.getItem().getCost();
		}
		return totalBill;
	}

	public static double getTotalNonGroceryItemsBilledAmount(Bill bill) {
		double totalBill = 0;
		for (Iterator iterator = bill.getItems().iterator(); iterator.hasNext();) {

			BillItem billItem = (BillItem) iterator.next();
			if (!billItem.getItem().getType().equals(ItemType.GROCERY_ITEM)) {
				totalBill += billItem.getQuantity() * billItem.getItem().getCost();
			}

		}
		return totalBill;
	}

}
