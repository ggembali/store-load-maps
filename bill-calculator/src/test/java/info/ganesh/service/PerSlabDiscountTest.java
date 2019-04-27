package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PerSlabDiscountTest {
	PerSlabDiscount perSlabDiscount = new PerSlabDiscount(100,5);

	@Test
	public void shouldCheckApplicability() {
		assertTrue(perSlabDiscount.isApplicable(BillingMother.affiliateBill()));
		assertTrue(perSlabDiscount.isApplicable(BillingMother.loyalUserBill()));
	
	}
	
	@Test
	public void shouldCalculateDiscount(){
		assertThat(perSlabDiscount.applicableDiscount(BillingMother.userBill()),is(300.0));
		assertThat(perSlabDiscount.applicableDiscount(BillingMother.loyalUserBill()),is(300.0));
	}

}
