package domain;

public class Tree extends Product {

	protected float height;

	
	
	public Tree(String botiga, float price, String name, int qty, float height) throws Exception {
		super(botiga, price, name, qty);
		this.height = height;
	}

	public Tree() {
		super();		
	}

//Getter setter
	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tree \tFloristeria: " + botiga + "\tNom: " + name + "\tAlçada: "
				+ height + "\tPreu: " + price +  "\tQuantitat: " + qty;
	}
	
	

}
