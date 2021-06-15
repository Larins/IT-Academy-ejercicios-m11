package testPairProgramming;

public abstract class Product {

		protected float price;
		protected String name;
		protected int qty;
		
		public Product(float price, String name, int qty) {
			this.price = price;
			this.name = name;
			this.qty = qty;
		}

}
