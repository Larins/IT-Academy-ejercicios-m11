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

	private HashMap<String, Floristeria> floristeries = new HashMap<String, Floristeria>();

	public FloristeriaController() {

	}

	// constructor floristeria

	public boolean createFloristeria(int idShop, String name) throws Exception {
		boolean ok = false;
		Floristeria flo = floristeries.get(name);
		if (flo != null) {
			System.out.println("La floristeria " + name + " ja existeix");
		} else {
			Floristeria floristeria = new Floristeria(idShop, name);
			floristeries.put(name, floristeria);
			ok = true;
		}

		return ok;
	}

	// remove producte

	public void removeProduct(Object botiga, String nomP) {
		try {
			Floristeria flo = floristeries.get(botiga);
			flo.removeProduct(nomP);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());
		}
	}

	// constructor tree

	public void createTree(String botiga, float price, String name, int qty, float height) throws Exception {
		try {
			Floristeria flo = floristeries.get(botiga);
			Tree tree = new Tree(botiga, price, name, qty, height);
			flo.addProduct(tree);
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
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");
		}
	}

	public void stock() {

		List<String> l = new ArrayList<String>(floristeries.keySet());

		for (String cadena : l) {
			System.out.println("Floristeria " + cadena);

			Floristeria flo = floristeries.get(cadena);
			System.out.println(flo.getAllProducts());

		}

	}

	public String stockbotiga(Object store) {

		String stockB;

		Floristeria f = floristeries.get(store);

		stockB = f.totalBotiga();

		return stockB;
	}

	public String valorTotal(Object store) {

		float totalValor = 0;

		Floristeria f = floristeries.get(store);

		totalValor = f.totalValor();

		return "\nTotal stock valorat de la floristeria : " + store + " es de " + totalValor + " Euros \n";

	}

}
