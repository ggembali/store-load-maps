package info.ganesh.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BillAmountCalculationUtilTest {

	@Test
	public void shouldCalculateBills() {
		assertThat(BillAmountCalculationUtil.getTotalBilledAmount(BillingMother.affiliateBill()),is(4660.0));
		assertThat(BillAmountCalculationUtil.getTotalNonGroceryItemsBilledAmount(BillingMother.affiliateBill()),is(660.0));
	}

}
