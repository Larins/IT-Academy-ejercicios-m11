package testPairProgramming;

public class Flower extends Product {
	
	protected static String color;
	
	public Flower(float price, String name, int qty, String color) {
		super(price, name, qty);
		
		this.color = color;
	}

}
