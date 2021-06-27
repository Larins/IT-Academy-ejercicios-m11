package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import application.FloristeriaController;

public class Main {
	public static void main(String[] args) throws Exception {
		FloristeriaController fc = new FloristeriaController();//Invoquem controller
		boolean continuar = true;
		int ids = 0; //Comptador inicial idShop
		String nomP = "nova Floristeria" ;//Variable nom del producte
		int qtyP; //Variable quantitat de producte
		float priceP; //Variable preu producte
        
		List<String> floristeriaList = new ArrayList<String>();//Arraylist floristeries per a selecionar botiga
        Object[] floristeriaObject = floristeriaList.toArray();//Arraylist floristeries convertit en objecte
        
        List<String> floProList = new ArrayList<String>();//Arraylist floristeries de cada producte
        Object[] floProObject = floProList.toArray();//Arraylist floristeries de cada producte convertit en objecte
        
        List<String> producteList = new ArrayList<String>();//Arraylist productes
        Object[] producteObject = producteList.toArray();//Arraylist productes convertit en objecte
		
        String[] deco = {"plastic", "wood"};//Arraylist materials admesos per al producte Decoration
		//String tecla;//Per continuar fent operacions
		int opciomenu;
		Scanner opcio = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------");
			System.out.println("Floristeria - Men� Principal");
			System.out.println("-------------------------------------");
			System.out.println("1  - Crear Floristeria");
			System.out.println("2  - Afegir Arbre");
			System.out.println("3  - Afegir Flor");
			System.out.println("4  - Afegir Decoraci�");
			System.out.println("5  - Stock totes les Floristeries");
			System.out.println("6  - Eliminar producte - en construcci� !!!");//nuevo
			System.out.println("7  - Stock botiga amb quantitats - en construcci� !!!!");//nuevo
			System.out.println("8  - Stock botiga (Valorat) - en construcci�");//nuevo
			System.out.println("9  - Sortir");//Sortir App
			
			try {
				opciomenu = opcio.nextInt();
			if (opciomenu > 0 && opciomenu <= 9) { // Adaptar if al nombre d'opcions
				switch (opciomenu) {
				case 1://Crear Floristeria
					ids++;
					String nom=JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
					if (fc.createFloristeria(ids, nom)){
						System.out.println("Floristeria : "+ ids + " - " + nom + " CREADA !!" );
				        floristeriaList.add(nom);
						floristeriaObject = floristeriaList.toArray();//nuevo
						
					}
					
					
			        break;
					
				case 2://Afegir arbre
					//floristeriaObject = floristeriaList.toArray();
					Object store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					int index = floristeriaObject.length;
					nomP = JOptionPane.showInputDialog("Introdueix nom de l' Arbre :");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					float alcada = Float.parseFloat(JOptionPane.showInputDialog("Introdueix l' al�ada de " + nomP));
					fc.createTree((String) store,priceP, nomP, qtyP, alcada);
					System.out.println ("Arbre creat");
			        producteList.add(nomP);//nuevo
					producteObject = producteList.toArray();//nuevo
			        floProList.add((String) store);//nuevo
			        floProObject = floProList.toArray();//nuevo
					System.out.println("lista productos provisional LIST: " + producteList + " - floristeria prod LIST: " + floProList);//nuevo
					System.out.println("lista productos provisional OBJ: " + floProObject);//nuevo

					break;
				case 3://Afegir flor
					//floristeriaObject = floristeriaList.toArray();
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					nomP =JOptionPane.showInputDialog("Introdueix nom de la flor:");
					qtyP = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat de " + nomP));
					priceP = Float.parseFloat(JOptionPane.showInputDialog("Introdueix el preu de " + nomP));
					String color = JOptionPane.showInputDialog("Introdueix color de " + nomP);
					fc.createFlower((String) store, priceP, nomP, qtyP, color);
					
					System.out.println ("Flor creada ");
					break;
				case 4://Afegir decoraci�
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					nomP =JOptionPane.showInputDialog("Introdueix nom del producte de decoraci�:");
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
				case 6://Eliminar producte
					Object productRemove = (String) JOptionPane.showInputDialog(null, "Selecciona el producte a eliminar","Eliminar producte",
							JOptionPane.QUESTION_MESSAGE, null, producteObject, producteObject[0]);
					floProList.remove(producteList.indexOf(productRemove));
					producteList.remove(producteList.indexOf(productRemove));
					System.out.println("lista productos provisional LIST: " + producteList + " - floristeria prod LIST: " + floProList);//nuevo
					System.out.println("lista productos provisional OBJ: " + floProObject);//nuevo
					System.out.println("Producte eliminat!\n");
					break;
					
				case 7: //Stock botiga amb quantitats
					System.out.println("Stock botiga amb quantitats - en construcci� !!!!");
					break;
					
				case 8: //Stock botiga (Valorat)
					System.out.println("Stock botiga (Valorat) - en construcci� !!!!!");
					//float stockprice = 0;
					store = (String) JOptionPane.showInputDialog(null, "Selecciona la floristeria","Seleccionar floristeria",
							JOptionPane.QUESTION_MESSAGE, null, floristeriaObject, floristeriaObject[0]);
					
					
					
					
					break;
					
				case 9:// Sortir
					continuar = false;
					System.out.println ("Gr�cies per fer servir la nostra App");
					
					break;
				}
			} else {
				System.out.println("Introdueix una opci� correcta");
			}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No has creat cap floristeria encara !!!!");

			}catch (NumberFormatException n) {
				System.out.println ("Valor incorrecte, ha de ser un nombre");
			}catch (InputMismatchException i) {
				
				System.out.println ("Escull una opci� correcte del mun�");
				opcio.nextLine();
				//continuar = true;
			}
			//opciomenu = opcio.nextInt();
		} while (continuar);
	
	}
}
