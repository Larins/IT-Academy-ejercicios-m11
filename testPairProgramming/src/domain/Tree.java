package domain;

public class Tree extends Product {

	protected static float height;

	public Tree(String botiga, float price, String name, int qty, float height) {
		super(botiga, price, name, qty);

		this.height = height;
		// TODO Auto-generated constructor stub
	}

	// Falta Incloure ID Floristeria

//Getter setter
	public static float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tree [Floristeria=" + botiga + ", idProduct=" + idProduct + ", price=" + price + ", name=" + name
				+ ", qty=" + qty + " height =" + height + "]";
	}

}
