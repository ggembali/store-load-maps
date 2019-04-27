package info.ganesh.domain;

import java.util.Iterator;
import java.util.List;

public class Bill {
	private User user;
	private List<BillItem> items;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<BillItem> getItems() {
		return items;
	}

	public void setItems(List<BillItem> items) {
		this.items = items;
	}


	public Bill(User user, List<BillItem> items) {
		super();
		this.user = user;
		this.items = items;
	}
}
