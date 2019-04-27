package info.ganesh.service;

import info.ganesh.domain.Item;
import info.ganesh.domain.ItemType;

public class ItemMother {

	public static Item chicken() {
		return new Item("Chicken",ItemType.OTHERS, 150);
	}
	
	public static Item rice() {
		return new Item("Rice",ItemType.GROCERY_ITEM, 70);
	}
	
	public static Item wheat() {
		return new Item("Wheat",ItemType.GROCERY_ITEM, 60);
	}
	
	public static Item apple() {
		return new Item("Apple",ItemType.OTHERS, 170);
	}

}
