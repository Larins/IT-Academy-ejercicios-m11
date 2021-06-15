package testPairProgramming;

public class Tree extends Product {
	
	protected float height;
	
	public Tree(float price, String name, int qty, float height) {
		super(price, name, qty);
		
		this.height = height;
	}

}
