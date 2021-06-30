package domain;

public class Product {

	protected Object botiga;
	protected float price;
	protected String name;
	protected int qty;

	public Product() {
		super();
	}

	public Product(String botiga, float price, String name, int qty) throws Exception {
		this.botiga = botiga;
		this.price = price;
		this.name = name;
		this.qty = qty;

	}

	// Getter Setters

	public Object getBotiga() {
		return botiga;
	}

	public void setBotiga(Object botiga) {
		this.botiga = botiga;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// if (getClass() != obj.getClass())
		// return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
