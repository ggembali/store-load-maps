package info.ganesh.service;

import java.util.Arrays;
import java.util.List;

import info.ganesh.domain.BillItem;

public class BillItemMother {

	public static List<BillItem> mixedItems() {
		return Arrays.asList(
			new BillItem(ItemMother.chicken(), 1),
			new BillItem(ItemMother.apple(), 3),
			new BillItem(ItemMother.rice(), 40),
			new BillItem(ItemMother.wheat(), 20));
	}

}
