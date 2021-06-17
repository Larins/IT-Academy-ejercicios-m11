package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.*;

public class FloristeriaRepository {

	private static List<Floristeria> floristeries = new ArrayList<>();
	private static List<Product> products = new ArrayList<>();
	private static List<Product> flowers
	= new ArrayList<>();


	public FloristeriaRepository() {
	}

	public List<Floristeria> getAllFloristeries() {
		return new ArrayList<>(floristeries);
	}

	public List<Product> getAllProducts() {
		return new ArrayList<>(products);
	}
	
	public List<Product> getAllFlowers() {
		return new ArrayList<>(flowers);
	}

	public void addFloristeria(Floristeria floristeria) throws Exception {
		if (floristeria == null)
			throw new Exception();
		floristeries.add(floristeria);
	}

	public void addProduct(Product product) throws Exception {
		if (product == null)
			throw new Exception();
		products.add(product);
	}

}
