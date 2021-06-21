package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import application.FloristeriaController;

public class MainMilestone1 {
	public static void main(String[] args) throws Exception {
		FloristeriaController fc = new FloristeriaController();//Invoquem controller
		int ids = 0; //comptador inicial idShop
		String nomP = "nova Floristeria" ;//variable nom del producte
		int qtyP; //variable quantitat de producte
		float priceP; //variable preu producte
        List<String> floristeriaList = new ArrayList<String>();//Arraylist floristeries per a selecionar botiga
        Object[] floristeriaObject = floristeriaList.toArray();
		String[] deco = {"plastic", "wood"};
		String tecla;//Per continuar fent operacions
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
			try {
				opciomenu = opcio.nextInt();
			if (opciomenu > 0 && opciomenu <= 5) { // Adaptar if al nombre d'opcions
				switch (opciomenu) {
				case 1://Crear Floristeria
					ids++;
					String nom=JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
					fc.createFloristeria(ids, nom);
					System.out.println("Floristeria : "+ ids + " - " + nom + " CREADA !!" );
			        floristeriaList.add(nom);
					break;
				case 2://Afegir arbre
					floristeriaObject = floristeriaList.toArray();
					Object store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					int index = floristeriaObject.length;
					nomP =JOptionPane.showInputDialog("Introdueix nom de l' Arbre :");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					float alcada = Float.parseFloat(JOptionPane.showInputDialog("Introdueix l' alçada de " + nomP));
					fc.createTree((String) store,priceP, nomP, qtyP, alcada);
					System.out.println ("Arbre creat");
					break;
				case 3://Afegir flor
					floristeriaObject = floristeriaList.toArray();
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
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
					nomP =JOptionPane.showInputDialog("Introdueix nom del producte de decoració:");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					String mat = (String) JOptionPane.showInputDialog(null, "Selecciona el material de " + nomP,"Afegir material",
							JOptionPane.QUESTION_MESSAGE, null, deco, deco[0]);
					fc.createDecoration((String)store,priceP, nomP, qtyP,mat);
					break;
				case 5://Printar stock: llista de floristeries y productes
					System.out.println("Stock floristeries i productes\n");
					fc.stock();
					break;
				}
			} else {
				System.out.println("Introdueix una opció correcta");
			}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No has creat cap floristeria encara !!!!");

			}catch (NumberFormatException n) {
				System.out.println ("Valor incorrecte, ha de ser un nombre");
			}
			System.out.println("_______________________________________");
			System.out.print("\nVols tornar a fer una operació? (S/N)\n");
			tecla = opcio.next();
		} while (tecla.equalsIgnoreCase("s"));
		System.out.println ("Gràcies per fer servir la nostra App");
	}
}
