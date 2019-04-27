package info.ganesh.service;

import info.ganesh.domain.Bill;
import info.ganesh.domain.Employee;

public class EmployeeDiscount extends PercentageDiscount {

	public EmployeeDiscount(int discountPercentage) {
		super(discountPercentage);
	}

	@Override
	public boolean isApplicable(Bill bill) {
		return bill.getUser() instanceof Employee;
	}
	

}
