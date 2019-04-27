package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import info.ganesh.domain.BillReceipt;

public class BillingApplicationTest {

	private BillingApplication billingApplication;

	@Before
	public void setup() {
		billingApplication = new BillingApplication();

		billingApplication.init();

	}

	@Test
	public void calculateNetPayableAmount() {
		BillReceipt calculateNetPayableBill = billingApplication.getBillingService().calculateNetPayableBill(BillingMother.userBill());
		assertNotNull(calculateNetPayableBill);
		assertThat(calculateNetPayableBill.getTotalBill(), is(4660.0));
		assertThat(calculateNetPayableBill.getNetPayable(), is(4360.0));
		
	}
	
	@Test
	public void calculateNetPayableAmountForAffiliate() {
		BillReceipt calculateNetPayableBill = billingApplication.getBillingService().calculateNetPayableBill(BillingMother.affiliateBill());
		assertNotNull(calculateNetPayableBill);
		assertThat(calculateNetPayableBill.getNetPayable(), is(4294.0));
		
	}
	
	@Test
	public void calculateNetPayableAmountEmployee() {
		BillReceipt calculateNetPayableBill = billingApplication.getBillingService().calculateNetPayableBill(BillingMother.employeeBill());
		assertNotNull(calculateNetPayableBill);
		assertThat(calculateNetPayableBill.getNetPayable(), is(4162.0));		
	}
	
	@Test
	public void calculateNetPayableAmountLoyalUser() {
		BillReceipt calculateNetPayableBill = billingApplication.getBillingService().calculateNetPayableBill(BillingMother.loyalUserBill());
		assertNotNull(calculateNetPayableBill);
		assertThat(calculateNetPayableBill.getNetPayable(), is(4162.0));		
	}

}
