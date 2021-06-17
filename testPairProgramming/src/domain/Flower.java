package domain;

public class Flower extends Product {

	protected static String color;

	// Falta Incloure ID Floristeria

	public Flower(String botiga, float price, String name, int qty, String color) {
		super(botiga, price, name, qty);

		this.color = color;
	}

	// Getter Setter
	
	public static String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flower [Floristeria " + botiga + ", price=" + price + ", name=" + name + ", qty=" + qty + " Color: "
				+ color + " ]";
	}

}
