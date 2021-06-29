package domain;

public class Flower extends Product {

	protected String color;

	public Flower(String botiga, float price, String name, int qty, String color) throws Exception {
		super(botiga, price, name, qty);

		this.color = color;
	}

	// Getter Setter
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flower \tFloristeria: " + botiga + "\tNom: " + name + "\tColor: "
				+ color + "\tPreu: " + price +  "\tQuantitat: " + qty;
	}

}
