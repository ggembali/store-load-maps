package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeDiscountTest {
	
	EmployeeDiscount employeeDiscount = new EmployeeDiscount(30);
	
	@Test
	public void shouldCheckApplicability() {
		assertFalse(employeeDiscount.isApplicable(BillingMother.affiliateBill()));
		assertTrue(employeeDiscount.isApplicable(BillingMother.loyalUserBill()));
	
	}
	
	@Test
	public void shouldCalculateDiscount(){
		assertThat(employeeDiscount.applicableDiscount(BillingMother.employeeBill()),is(198.0));
		assertThat(employeeDiscount.applicableDiscount(BillingMother.userBill()),is(0.0));
	}
}
