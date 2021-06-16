package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import application.FloristeriaController;

public class Main {
	public static void main(String[] args) throws Exception {
		
		FloristeriaController fc = new FloristeriaController();
		int ids = 0; // comptador inicial idShop
		String nomP = "nova Floristeria" ;// variable nom del producte
		int qtyP; // variable quantitat de producte
		float priceP; // variable preu producte
		
		String[] deco = {"plastic", "wood"};
		
		// Preguntar al usuario el producto y atributos que desea introducir.

		// Crear los objetos.

		// Imprimir la lista de objetos.

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
			
			opciomenu = opcio.nextInt();

			if (opciomenu > 0 && opciomenu <= 5) { // Adaptar if al nombre d' opcions

				switch (opciomenu) {
				case 1://Crear Floristeria
					ids++;
					
					String nom=JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
					fc.createFloristeria(ids, nom);
					
					System.out.println("Floristeria : "+ ids + " - " + nom + " CREADA !!" );
					
					break;
					
				case 2://Afegir arbre
					
					//int Idf = (int) JOptionPane.showInputDialog(null, "Selecciona la Floristeria :","Afegir arbre", JOptionPane.QUESTION_MESSAGE, null, platos, platos[0]); 
					//incloure idProduct
					nomP =JOptionPane.showInputDialog("Introdueix nom de l' Arbre :");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					float alcada = Float.parseFloat(JOptionPane.showInputDialog("Introdueix l' alçada de " + nomP));
					fc.createTree(priceP, nomP, qtyP, alcada);
					
					System.out.println ("Arbre creat ");
					
					break;
					
				case 3://Afegir flor
					
					//int Idf = (int) JOptionPane.showInputDialog(null, "Selecciona la Floristeria :","Afegir arbre", JOptionPane.QUESTION_MESSAGE, null, platos, platos[0]); 
					//incloure idProduct
					nomP =JOptionPane.showInputDialog("Introdueix nom de la flor:");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					String color = JOptionPane.showInputDialog("Introdueix color de " + nomP);
					fc.createFlower(priceP, color, qtyP, nomP);
					System.out.println ("Flor creada ");
					break;
					
				case 4://Afegir decoració
					
					//incloure idProduct
					
					//String mat = "plastic";
					nomP =JOptionPane.showInputDialog("Introdueix nom del producte de decoració:");
					

					String mat = (String) JOptionPane.showInputDialog(null, "Selecciona el material de " + nomP,"Afegir arbre",
							JOptionPane.QUESTION_MESSAGE, null, deco, deco[0]);
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					//mat = JOptionPane.showInputDialog("Introdueix material de " + nomP);
					fc.createDecoration(priceP, nomP, qtyP, mat);
					
					break;
					
				case 5: // Stock
					fc.getAllProducts();
					break;
				
				}

			} else {
				System.out.println("Introdueïx una opció correcte");
			}

			System.out.println("_______________________________________");

			System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");

			tecla = opcio.next();

		} while (tecla.equalsIgnoreCase("s"));
		System.out.println ("Gracies per fer servir la nostre App");
		
		//Printar l'stock de productes.
		
		//String allProducts=fc.getAllProducts();
		//System.out.println("PRODUCTES EN STOCK:\n\n" + allProducts + " \n");
	}

}
