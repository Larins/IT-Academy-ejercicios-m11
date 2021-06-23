package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;
import domain.Decoration;
import domain.Floristeria;
import domain.Flower;
import domain.Product;
import domain.Tree;

public class FloristeriaController {

	// private FloristeriaRepository repository;
	private HashMap<String, Floristeria> floristeries = new HashMap<String, Floristeria>();

	public FloristeriaController() {

		// repository = new FloristeriaRepository();
	}

	// constructor floristeria

	public boolean createFloristeria(int idShop, String name) throws Exception {
		boolean ok=false;
			Floristeria flo = floristeries.get(name);
			if (flo != null) {
				System.out.println("La floristeria " + name + " ja existeix");
			} else {
				Floristeria floristeria = new Floristeria(idShop, name);
				floristeries.put(name, floristeria);
				ok=true;
			}

		return ok;
	}

	// constructor tree

	public void createTree(String botiga, float price, String name, int qty, float height) throws Exception {
		try {
			Tree tree = new Tree(botiga, price, name, qty, height);
			Floristeria flo = floristeries.get(botiga);
			flo.addProduct(tree);
			// repository.addProduct(tree);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());
		}
	}

	// constructor flower

	public void createFlower(String botiga, float price, String name, int qty, String color) throws Exception {
		try {
			Flower flower = new Flower(botiga, price, name, qty, color);
			Floristeria flo = floristeries.get(botiga);
			flo.addProduct(flower);
			// repository.addProduct(flower);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());
		}
	}

	// constructor decoration

	public void createDecoration(String botiga, float price, String name, int qty, String material) throws Exception {
		try {
			Decoration decoration = new Decoration(botiga, price, name, qty, material);
			Floristeria flo = floristeries.get(botiga);
			flo.addProduct(decoration);
			// repository.addProduct(decoration);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");
		}
	}

	// GetAllProducts
	public String getAllProducts() {
		StringBuilder sb = new StringBuilder();
		for (Entry<String, Floristeria> entry : floristeries.entrySet()) {
			// String key = entry.getKey();
			Floristeria value = entry.getValue();
			sb.append(value.getAllProducts());
		}
		// for (Product product : getAllProducts())
		// sb.append("\n\tBotiga: ").append(product.getBotiga()).append("\n\tNom:
		// ").append(product.getName()).append("\n\tPreu:
		// ").append(product.getPrice()).append("\n\tQuantitat:
		// ").append(product.getQty()).append("\n\tAtribut:
		// ").append(Flower.getColor()).append(Tree.getHeight()).append(Decoration.getMaterial()).append("\n\n");
		return sb.toString();
	}

	/*
	 * Get all Trees
	 * 
	 * 
	 * public String getAllTrees() { StringBuilder sbT = new StringBuilder(); for
	 * (Tree tree : repository.getAllTrees())
	 * sbT.append("\n\tBotiga: ").append(tree.getBotiga()).append("\n\tFlor: ").
	 * append(tree.getName()).append("\n\tPreu: ").append(tree.getPrice()).
	 * append("\n\tQuantitat: ").append(tree.getQty()).append("\n\tAlçada: ").append
	 * (Tree.getHeight()).append("\n\n"); return sbT.toString(); }
	 */

	/*
	 * Get all Flowers
	 * 
	 * public String getAllFlowers() { StringBuilder sbF = new StringBuilder(); for
	 * (Flower flower : repository.getAllFlowers())
	 * sbF.append("\n\tBotiga: ").append(flower.getBotiga()).append("\n\tFlor: ").
	 * append(flower.getName()).append("\n\tPreu: ").append(flower.getPrice()).
	 * append("\n\tQuantitat: ").append(flower.getQty()).append("\n\tColor: ").
	 * append(Flower.getColor()).append("\n\n"); return sbF.toString(); }
	 */

	/*
	 * /Get all Decorations
	 * 
	 * public String getAllDecorations() { StringBuilder sbD = new StringBuilder();
	 * for (Decoration decoration : repository.getAllDecorations())
	 * sbD.append("\n\tBotiga: ").append(decoration.getBotiga()).append("\n\tFlor: "
	 * ).append(decoration.getName()).append("\n\tPreu: ").append(decoration.
	 * getPrice()).append("\n\tQuantitat: ").append(decoration.getQty()).
	 * append("\n\tMaterial: ").append(((Decoration)
	 * decoration).getMaterial()).append("\n\n"); return sbD.toString(); }
	 */

	public void stock() {
		// System.out.println(getAllFloristeries());

		List<String> l = new ArrayList<String>(floristeries.keySet());
		for (String cadena : l) {
			System.out.println(cadena);
		}
		System.out.println(getAllProducts());

	}

	public String stockbotiga() {

		System.out.println(getAllProducts());
		return null;
	}
	
	public void valorTotal(String strore) {
		
		
		
	}

}
