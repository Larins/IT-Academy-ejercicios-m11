package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import application.FloristeriaController;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//Invocamos al controller y 
		
		FloristeriaController fc = new FloristeriaController();
		int ids = 0; // comptador inicial idShop
		String nomP = "nova Floristeria" ;// variable nom del producte
		int qtyP; // variable quantitat de producte
		float priceP; // variable preu producte
		//Arraylist floristeries per a selecionar botiga
        List<String> floristeriaList = new ArrayList<String>();
        Object[] floristeriaObject = floristeriaList.toArray();

		
		String[] deco = {"plastic", "wood"};
		
		// Preguntar al usuario el producto y atributos que desea introducir.

		// Crear los objetos.


		String tecla;// Per continuar fent operacions
		int opciomenu;
		Scanner opcio = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------");
			System.out.println("Floristeria - Menú Principal");
			System.out.println("-------------------------------------");
			System.out.println("1  - Crear Floristeria");
			System.out.println("2  - Afegir Arbre");
			System.out.println("3  - Afegir Flor");
			System.out.println("4  - Afegir Decoració");
			System.out.println("5  - Stock");
			//System.out.println("5  - Sortir");
			try {
				opciomenu = opcio.nextInt();
			
			


			if (opciomenu > 0 && opciomenu <= 5) { // Adaptar if al nombre d' opcions

				switch (opciomenu) {
				case 1://Crear Floristeria
					ids++;
					
					
					String nom=JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
					fc.createFloristeria(ids, nom);
					
					System.out.println("Floristeria : "+ ids + " - " + nom + " CREADA !!" );
					
			        floristeriaList.add(nom);

					//String[] floristeriaArray = new String[floristeriaList.size()];
					//floristeriaArray = floristeriaList.toArray(floristeriaArray);

			        

					
					break;
					
				case 2://Afegir arbre
					
					//incloure idProduct
					//List<String> floristeriaList = new ArrayList<String>();
					floristeriaObject = floristeriaList.toArray();
					Object store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					
					int index = floristeriaObject.length;
					nomP =JOptionPane.showInputDialog("Introdueix nom de l' Arbre :");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					float alcada = Float.parseFloat(JOptionPane.showInputDialog("Introdueix l' alçada de " + nomP));
					fc.createTree((String) store,priceP, nomP, qtyP, alcada);
					
					System.out.println ("Arbre creat ");
					
					break;
					
				case 3://Afegir flor
					
					//Object stores = null;
					//fc.selectbotiga(stores);
					floristeriaObject = floristeriaList.toArray();
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
										 
					//incloure idProduct
					nomP =JOptionPane.showInputDialog("Introdueix nom de la flor:");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					String color = JOptionPane.showInputDialog("Introdueix color de " + nomP);
					fc.createFlower((String) store, priceP, nomP, qtyP, color);
					System.out.println ("Flor creada ");
					break;
					
				case 4://Afegir decoració
					
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					
					//incloure idProduct
					
					//String mat = "plastic";
					nomP =JOptionPane.showInputDialog("Introdueix nom del producte de decoració:");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					//mat = JOptionPane.showInputDialog("Introdueix material de " + nomP);
					String mat = (String) JOptionPane.showInputDialog(null, "Selecciona el material de " + nomP,"Afegir material",
							JOptionPane.QUESTION_MESSAGE, null, deco, deco[0]);
					fc.createDecoration((String)store,priceP, nomP, qtyP,mat);
					
					break;
					
				case 5: // Stock

					//System.out.println ("Stock material");
					System.out.println("Stock Floristeries i productes");
					fc.stock();
					
					//Método 1 para printar el stock
					//System.out.print("___________________METODE 1");
					//String allProducts=fc.getAllProducts();
					
					//Método 2 para printar el stock
					//System.out.print("___________________METODE 2");
					//System.out.println("\nPRODUCTES EN STOCK:\n" + fc.getAllProducts() + "\n");
					
					//Método 3 para printar el stock
					
					//System.out.print("___________________METODE 3");
					//System.out.println("\nPRODUCTES EN STOCK:\n");
					//System.out.println("\nARBRES\n" + fc.getAllTrees()+"\n");
					//System.out.println("\nFLORS\n" + fc.getAllFlowers()+"\n");
					//System.out.println("\nDECORACIONS\n" + fc.getAllDecorations()+"\n");

					
					break;
				
				}

			} else {
				System.out.println("Introdueïx una opció correcta");
			}
			}catch (Exception e) {
				System.out.println("Valor incorrecte");
			}

			System.out.println("_______________________________________");

			System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");

			tecla = opcio.next();

		} while (tecla.equalsIgnoreCase("s"));
		System.out.println ("Gracies per fer servir la nostra App");
		
		// Imprimir la lista de objetos.

		
		//Printar l'stock de productes.
		
		//String allProducts=fc.getAllProducts();
		//System.out.println("PRODUCTES EN STOCK:\n\n" + allProducts + " \n");
	}

}
