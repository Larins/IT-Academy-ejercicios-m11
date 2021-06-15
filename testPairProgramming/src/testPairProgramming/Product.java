package testPairProgramming;

public abstract class Product {

		protected int idFloristeria;
		protected int idProduct;
		protected float price;
		protected String name;
		protected int qty;
		
		private static int COUNTER_PRODUCTS = 1;
		
		public Product(float price, String name, int qty) {
			this.price = price;
			this.name = name;
			this.qty = qty;

			idProduct = COUNTER_PRODUCTS;
			COUNTER_PRODUCTS++;
			
		
		}
		
		//Getter Setters

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
