package domain;

public class Tree extends Product {
	
	protected static float height;
	
	
	// Falta Incloure ID Floristeria
	public Tree(float price, String name, int qty, float height) {
		super(price, name, qty);
		
		this.height = height;
	}
//Getter setter
	public static float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
