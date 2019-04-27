package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class LoyaltyDiscountTest {

	LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount(5);

	@Test
	public void shouldCheckApplicability() {
		assertTrue(loyaltyDiscount.isApplicable(BillingMother.affiliateBill()));
		assertTrue(loyaltyDiscount.isApplicable(BillingMother.loyalUserBill()));
	
	}
	
	@Test
	public void shouldCalculateDiscount(){
		assertThat(loyaltyDiscount.applicableDiscount(BillingMother.userBill()),is(0.0));
		assertThat(loyaltyDiscount.applicableDiscount(BillingMother.loyalUserBill()),is(33.0));
	}
}
