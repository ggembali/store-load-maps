package info.ganesh.service;

import info.ganesh.domain.Bill;
import info.ganesh.domain.BillItem;

public class BillingMother {

	public static Bill userBill() {
		return new Bill(UserMother.normalUser(),BillItemMother.mixedItems());
	}
	
	public static Bill employeeBill() {
		return new Bill(UserMother.employeeForMoreThan2Years(),BillItemMother.mixedItems());
	}
	
	public static Bill affiliateBill() {
		return new Bill(UserMother.affiliate(),BillItemMother.mixedItems());
	}
	
	public static Bill loyalUserBill() {
		return new Bill(UserMother.employeeForMoreThan2Years(),BillItemMother.mixedItems());
	}

}
