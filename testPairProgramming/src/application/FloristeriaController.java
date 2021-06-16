package application;

import domain.Decoration;
import domain.Floristeria;
import domain.Flower;
import domain.Product;
import domain.Tree;
import persistence.FloristeriaRepository;

public class FloristeriaController {
	
	private FloristeriaRepository repository;
	
	public FloristeriaController() {
		
		repository = new FloristeriaRepository();
	}
	
	public void createFloristeria(int idShop, String name) throws Exception {
    	try {
	        Floristeria floristeria = new Floristeria(idShop, name);
	        repository.addFloristeria(floristeria);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	
	public void createDecoration(float price, String name, int qty,String material) throws Exception {
    	try {
	        Decoration decoration = new Decoration(price, name, qty, Decoration.getMaterial());
	        repository.addProduct(decoration);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	
	public void createFlower(float price, String name, int qty, String color) throws Exception {
    	try {
	        Flower flower = new Flower(price, name, qty, Flower.getColor());
	        repository.addProduct(flower);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	public void createTree(float price, String name, int qty, float height) throws Exception {
    	try {
    		Tree tree = new Tree(price, name, qty, Tree.getHeight());
	        repository.addProduct(tree);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
    public String getAllProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : repository.getAllProducts())
            sb.append(product.getName()).append("\n\n");
        return sb.toString();
    }

}
