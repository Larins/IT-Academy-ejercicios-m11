package testPairProgramming;

public abstract class Product {

		protected int id;
		protected float price;
		protected String name;
		protected int qty;
		
		private static int COUNTER_PRODUCTS = 1;
		
		public Product(float price, String name, int qty) {
			this.price = price;
			this.name = name;
			this.qty = qty;

			id = COUNTER_PRODUCTS;
			COUNTER_PRODUCTS++;
			
		
		}

}
