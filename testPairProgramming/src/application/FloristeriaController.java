package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
	
	public void createDecoration(String botiga,float price, String name, int qty,String material) throws Exception {
    	try {
	        Decoration decoration = new Decoration(botiga,price, name, qty, Decoration.getMaterial());
	        repository.addProduct(decoration);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	
	public void createFlower(String botiga,float price, String name, int qty, String color) throws Exception {
    	try {
	        Flower flower = new Flower(botiga,price, name, qty, color);
	        repository.addProduct(flower);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	public void createTree(String botiga,float price, String name, int qty, float height) throws Exception {
    	try {
    		Tree tree = new Tree(botiga,price, name, qty, height);
	        repository.addProduct(tree);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
    public String getAllProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : repository.getAllProducts())
            sb.append(Product.getBotiga()).append("\n\t").append(product.getName()).append("\n\t").append(product.getPrice()).append("\n\t").append(product.getQty()).append("\n\t").append(Flower.getColor()).append("\n\t");
        	return sb.toString();
    }
    
    public String getAllFlowers() {
        StringBuilder sb = new StringBuilder();
        for (Product flower : repository.getAllFlowers())
            sb.append(flower.getName()).append("\n\n");
        	return sb.toString();
    }
    
    public String stock() {
    	
       	
    	System.out.println(repository.getAllFloristeries());
    	System.out.println(repository.getAllProducts());
    	System.out.println(repository.getAllFlowers());
    	
    	
    	return null;
    	
    }
    
   /* public String selectbotiga(Object stores) {
    	List<String> floristeriaList = new ArrayList<String>();
    	Object[] floristeriaObject = floristeriaList.toArray();
		Object store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
				JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
    	
		return (String) store;
    }*/

}
