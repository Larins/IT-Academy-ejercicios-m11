package domain;

public class Decoration extends Product {
	
	protected String material;
	
	public Decoration(String botiga,float price, String name, int qty, String material) throws Exception {
		super(botiga,price, name, qty);
		this.material = material;
	}
	//Getter Setter
	public String getMaterial() {
		return material;
	}

	public void setMaterial() {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Decoració \tFloristeria: " + botiga + "\tNom: " + name + "\tMaterial: "
				+ material + "\tPreu: " + price +  "\tQuantitat: " + qty;
	}

}
