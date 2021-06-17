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
	
	//constructor floristeria
	
	public void createFloristeria(int idShop, String name) throws Exception {
    	try {
	        Floristeria floristeria = new Floristeria(idShop, name);
	        repository.addFloristeria(floristeria);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	//constructor tree
	
	public void createTree(String botiga,float price, String name, int qty, float height) throws Exception {
    	try {
    		Tree tree = new Tree(botiga,price, name, qty, height);
	        repository.addProduct(tree);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	//constructor flower
	
	public void createFlower(String botiga,float price, String name, int qty, String color) throws Exception {
    	try {
	        Flower flower = new Flower(botiga, price, name, qty, color);
	        repository.addProduct(flower);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	//constructor decoration
	
	public void createDecoration(String botiga, float price, String name, int qty,String material) throws Exception {
    	try {
	        Decoration decoration = new Decoration(botiga, price, name, qty, Decoration.getMaterial());
	        repository.addProduct(decoration);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	

	
	//GetAllProducts
	
    public String getAllProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : repository.getAllProducts())
            sb.append("\n\tBotiga: ").append(product.getBotiga()).append("\n\tFlor: ").append(product.getName()).append("\n\tPreu: ").append(product.getPrice()).append("\n\tQuantitat: ").append(product.getQty()).append("\n\tColor: ").append(Flower.getColor()).append("\n\n");
        	return sb.toString();
    }
	
	
	//Get all Trees
	

	 public String getAllTrees() {
	        StringBuilder sb = new StringBuilder();
	        for (Tree tree : repository.getAllTrees())
	        	sb.append("\n\tBotiga: ").append(tree.getBotiga()).append("\n\tFlor: ").append(tree.getName()).append("\n\tPreu: ").append(tree.getPrice()).append("\n\tQuantitat: ").append(tree.getQty()).append("\n\tColor: ").append(Flower.getColor()).append("\n\n");
	        	return sb.toString();
	    }
	
	//Get all Flowers
    
    public String getAllFlowers() {
        StringBuilder sb = new StringBuilder();
        for (Flower flower : repository.getAllFlowers())
        	sb.append("\n\tBotiga: ").append(flower.getBotiga()).append("\n\tFlor: ").append(flower.getName()).append("\n\tPreu: ").append(flower.getPrice()).append("\n\tQuantitat: ").append(flower.getQty()).append("\n\tColor: ").append(Flower.getColor()).append("\n\n");
        	return sb.toString();
    }
    
    //Get all Decorations
    
    public String getAllDecorations() {
        StringBuilder sb = new StringBuilder();
        for (Decoration decoration : repository.getAllDecorations())
        	sb.append("\n\tBotiga: ").append(decoration.getBotiga()).append("\n\tFlor: ").append(decoration.getName()).append("\n\tPreu: ").append(decoration.getPrice()).append("\n\tQuantitat: ").append(decoration.getQty()).append("\n\tMaterial: ").append(((Decoration) decoration).getMaterial()).append("\n\n");
        	return sb.toString();
    }
    
    public String stock() {
    	
       	
    	System.out.println(repository.getAllFloristeries());
    	System.out.println(repository.getAllProducts());
    	System.out.println(repository.getAllTrees());
    	System.out.println(repository.getAllFlowers());
    	System.out.println(repository.getAllDecorations());

    	
    	
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
