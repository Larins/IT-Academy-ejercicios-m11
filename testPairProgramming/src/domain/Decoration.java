package domain;

public class Decoration extends Product {
	
	protected static String material;
	
	public Decoration(String botiga,float price, String name, int qty, String material) throws Exception {
		super(botiga,price, name, qty);
		//if((! material.equalsIgnoreCase("plastic") || ! material.equalsIgnoreCase("wood"))) throw new Exception(" El material debe ser 'plastic' o 'wood'.");
		Decoration.material = material;
	}
	//Getter Setter
	public static String getMaterial() {
		return material;
	}

	public void setMaterial() {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "\nDecoració \n\tFloristeria: " + botiga + "\n\tNom: " + name + "\n\tMaterial: "
				+ material + "\n\tPreu: " + price +  "\n\tQuantitat: " + qty + "\n";
	}

}
