package info.ganesh.domain;

public class BillReceipt {
	private Bill bill;
	private double netPayable;
	private double totalBill;

	public BillReceipt(Bill bill, double netPayable, double totalBill) {
		super();
		this.bill = bill;
		this.netPayable = netPayable;
		this.totalBill = totalBill;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public double getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(double netPayable) {
		this.netPayable = netPayable;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return new StringBuffer().append("Total Bill ").append(this.totalBill).append("\n").append("Net payable ").append(netPayable).toString();
	}
}
