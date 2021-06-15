package testPairProgramming;

public class Decoration extends Product {
	
	protected String material;
	
	public Decoration(float price, String name, int qty, String material) throws Exception {
		super(price, name, qty);
		if((! material.equalsIgnoreCase("plastic") || ! material.equalsIgnoreCase("wood"))) throw new Exception("El material debe ser 'plastic' o 'wood'.");
		this.material = material;
	}
	//Getter Setter
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
