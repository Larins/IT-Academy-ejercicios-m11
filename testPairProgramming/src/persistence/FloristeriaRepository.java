package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.*;

public class FloristeriaRepository {

	private static List<Floristeria> floristeries = new ArrayList<>();
	private static List<Product> products = new ArrayList<>();
	//private static List<Tree> trees = new ArrayList<>();
	//private static List<Flower> flowers = new ArrayList<>();
	//private static List<Decoration> decorations = new ArrayList<>();


	public FloristeriaRepository() {
	}
	
	public List<Floristeria> getAllFloristeries() {
		return new ArrayList<>(floristeries);
	}
	
	public List<Product> getAllProducts() {
		return new ArrayList<>(products);
	}

	/*public List<Tree> getAllTrees() {
		return new ArrayList<Tree>(trees);
	}
	
	public List<Flower> getAllFlowers() {
		return new ArrayList<>(flowers);
	}
	
	public List<Decoration> getAllDecorations() {
		return new ArrayList<>(decorations);
	}*/

	public void addFloristeria(Floristeria floristeria) throws Exception {
		if (floristeria == null)
			throw new Exception("La floristeria no pot estar buida.");
		floristeries.add(floristeria);
	}

	public void addProduct(Product product) throws Exception {
		if (product == null)
			throw new Exception("El producte no pot estar buit.");
		products.add(product);
		
	}

	public List<Product> getProducts() {
		return products;
	}
	

}
