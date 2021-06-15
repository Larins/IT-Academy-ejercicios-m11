package testPairProgramming;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws Exception {
		
		FloristeriaController fc = new FloristeriaController();
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
			System.out.println("3  - Afegir Decoració");
			System.out.println("4  - Stock");
			System.out.println("5  - Sortir");
			
			opciomenu = opcio.nextInt();

			if (opciomenu > 0 && opciomenu <= 5) { // Adaptar if al nombre d' opcions

				switch (opciomenu) {
				case 1:
					int ids = Integer.parseInt(JOptionPane.showInputDialog("Id Floristeria:"));
					
					String nom=JOptionPane.showInputDialog("Introdueix nom de la Floristeria");
					fc.createFloristeria(ids, nom);
					break;
				case 2:
					// vc.createBike();
					break;
				case 3:

					break;
				case 4:
					
					break;
					
				case 5:
					
					return;
				
				}

			} else {
				System.out.println("Introdueïx una opció correcte");
			}

			System.out.println("_______________________________________");

			System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");

			tecla = opcio.next();

		} while (tecla.equalsIgnoreCase("s"));
		System.out.println ("Gracies per fer servir la nostre App");
	}

}
