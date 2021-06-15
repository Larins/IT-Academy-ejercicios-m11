package domain;

public class Flower extends Product {
	
	protected static String color;
	
	// Falta Incloure ID Floristeria
	
	public Flower(float price, String name, int qty, String color) {
		super(price, name, qty);
		
		this.color = color;
	}
	//Getter Setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
