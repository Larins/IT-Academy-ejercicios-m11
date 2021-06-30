package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import application.FloristeriaController;

public class Main {
	public static void main(String[] args) throws Exception {
		FloristeriaController fc = new FloristeriaController();// Invoquem controller
		boolean continuar = true;
		int ids = 0; // Comptador inicial idShop
		String nomP = "nova Floristeria";// Variable nom del producte
		int qtyP; // Variable quantitat de producte
		float priceP; // Variable preu producte

		List<String> floristeriaList = new ArrayList<String>();// Arraylist floristeries per a selecionar botiga
		Object[] floristeriaObject = floristeriaList.toArray();// Arraylist floristeries convertit en objecte

		List<String> producteList = new ArrayList<String>();// Arraylist productes
		Object[] producteObject = producteList.toArray();// Arraylist productes convertit en objecte

		String[] deco = { "plastic", "wood" };// Arraylist materials admesos per al producte Decoration
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
			System.out.println("5  - Stock totes les Floristeries");
			System.out.println("6  - Eliminar Producte");
			System.out.println("7  - Stock Floristeria amb quantitats");
			System.out.println("8  - Stock Floristeria (Valorat)");
			System.out.println("9  - Sortir");// Sortir App

			try {
				opciomenu = opcio.nextInt();
				if (opciomenu > 0 && opciomenu <= 9) { // Adaptar if al nombre d'opcions
					switch (opciomenu) {
					case 1:// Crear Floristeria
						ids++;
						String nom = JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
						if (fc.createFloristeria(ids, nom)) {
							System.out.println("Floristeria : " + ids + " - " + nom + " CREADA !!");
							floristeriaList.add(nom);
							floristeriaObject = floristeriaList.toArray();

						}

						break;

					case 2:// Afegir arbre
						Object store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);
						int index = floristeriaObject.length;
						nomP = JOptionPane.showInputDialog("Introdueix nom de l' Arbre :");
						qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
						priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
						float alcada = Float.parseFloat(JOptionPane.showInputDialog("Introdueix l' alçada de " + nomP));
						fc.createTree((String) store, priceP, nomP, qtyP, alcada);
						producteList.add(nomP);
						producteObject = producteList.toArray();

						System.out.println("Arbre creat");

						break;

					case 3:// Afegir flor
						store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);
						nomP = JOptionPane.showInputDialog("Introdueix nom de la flor:");
						qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
						priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
						String color = JOptionPane.showInputDialog("Introdueix color de " + nomP);
						fc.createFlower((String) store, priceP, nomP, qtyP, color);

						producteList.add(nomP);
						producteObject = producteList.toArray();

						System.out.println("Flor creada ");

						break;

					case 4:// Afegir decoració
						store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);
						nomP = JOptionPane.showInputDialog("Introdueix nom del producte de decoració:");
						qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
						priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
						String mat = (String) JOptionPane.showInputDialog(null, "Selecciona el material de " + nomP,
								"Afegir material", JOptionPane.QUESTION_MESSAGE, null, deco, deco[0]);
						fc.createDecoration((String) store, priceP, nomP, qtyP, mat);

						producteList.add(nomP);
						producteObject = producteList.toArray();

						System.out.println("Decoració creada ");

						break;
					case 5:// Printar stock: llista de floristeries y productes

						System.out.println("Stock floristeries i productes\n");
						fc.stock();
						break;

					case 6:// Eliminar producte

						Object botiga = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);

						nomP = (String) JOptionPane.showInputDialog(null, "Selecciona el producte a eliminar",
								"Eliminar producte", JOptionPane.QUESTION_MESSAGE, null, producteObject,
								producteObject[0]);

						fc.removeProduct((String) botiga, nomP);

						if (producteList.contains(nomP)) {
							producteList.remove(nomP);
							producteObject = producteList.toArray();
						}

						System.out.println("Producte eliminat!\n");
						break;

					case 7: // Stock botiga amb quantitats

						store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);
						JOptionPane.showMessageDialog(null, fc.stockbotiga(store));

						break;

					case 8: // Stock botiga (Valorat)

						store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria",
								"Seleccionar floristeria", JOptionPane.QUESTION_MESSAGE, null, floristeriaObject,
								floristeriaObject[0]);

						JOptionPane.showMessageDialog(null, fc.valorTotal(store));

						break;

					case 9:// Sortir
						continuar = false;
						System.out.println("Gràcies per fer servir la nostra App");

						break;
					}
				} else {
					System.out.println("Introdueix una opció correcta");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La llista està buida!!");

			} catch (NumberFormatException n) {
				System.out.println("Valor incorrecte, ha de ser un nombre");
			} catch (InputMismatchException i) {

				System.out.println("Escull una opció correcta del munú");
				opcio.nextLine();
			}
		} while (continuar);

	}
}
