package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AffiliateDiscountTest {
	
	AffiliateDiscount affiliate = new AffiliateDiscount(10);

	@Test
	public void shouldCheckApplicability() {
		assertTrue(affiliate.isApplicable(BillingMother.affiliateBill()));
		assertFalse(affiliate.isApplicable(BillingMother.loyalUserBill()));
	
	}
	
	@Test
	public void shouldCalculateDiscount(){
		assertThat(affiliate.applicableDiscount(BillingMother.affiliateBill()),is(66.0));
		assertThat(affiliate.applicableDiscount(BillingMother.employeeBill()),is(0.0));
	}

}
