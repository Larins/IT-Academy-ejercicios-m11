package testPairProgramming;

public class Decoration extends Product {
	
	protected static String material;
	
	public Decoration(float price, String name, int qty, String material) throws Exception {
		super(price, name, qty);
		if((! material.equals("plastic") || ! material.equals("wood"))) throw new Exception("El material debe ser 'plastic' o 'wood'.");
		this.material = material;
	}

}
