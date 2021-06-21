package domain;

public class Tree extends Product {

	protected static float height;

	public Tree(String botiga, float price, String name, int qty, float height) throws Exception {
		super(botiga, price, name, qty);

		Tree.height = height;
		// TODO Auto-generated constructor stub
	}

//Getter setter
	public static float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "\nTree \n\tFloristeria: " + botiga + "\n\tNom: " + name + "\n\tAlçada: "
				+ height + "\n\tPreu: " + price +  "\n\tQuantitat: " + qty + "\n";
	}

}
