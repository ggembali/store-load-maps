package info.ganesh.domain;

public class Item {
	private String name;
	private ItemType type;
	private double cost;

	public Item(String name, ItemType type, double cost) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
