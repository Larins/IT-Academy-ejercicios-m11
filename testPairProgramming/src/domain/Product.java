package domain;

public abstract class Product {

	protected static Object botiga;
	protected int idProduct;
	protected float price;
	protected String name;
	protected int qty;

	private static int COUNTER_PRODUCTS = 1;

	public Product(String botiga,float price, String name, int qty) {
		Product.botiga = botiga;
		this.price = price;
		this.name = name;
		this.qty = qty;

		idProduct = COUNTER_PRODUCTS;
		COUNTER_PRODUCTS++;

	}

	// Getter Setters

	public static Object getBotiga() {
		return botiga;
	}

	public void setBotiga(Object botiga) {
		Product.botiga = botiga;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int id) {
		this.idProduct = idProduct;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
				
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public static int getCOUNTER_PRODUCTS() {
		return COUNTER_PRODUCTS;
	}

	public static void setCOUNTER_PRODUCTS(int cOUNTER_PRODUCTS) {
		COUNTER_PRODUCTS = cOUNTER_PRODUCTS;
	}

}
