

	/**
	* El programa RESTAURANTE ofrece un men� al cliente.
	* El cliente puede solicitar tantos platos como desee.
	* El programa calcula el precio de los platos.
	* Tambi�n sugiere la combinaci�n �ptima de billetes para pagarlos.
	* 
	* 
	* @author  Lara Saiz
	* @version 1.0
	* @since   2020-11-20 
	*/

package testPairProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;


public class EjemploRestaurante {

		
		public static void main(String[] args) {
							
			//Declaramos y poblamos el Array con los platos del men�.
			
				String[] platos = {"Ensalada de la casa", "Escalivada con anchoas", "Canelones de espinaca", "Tortilla de alcachofas", "Macarrones bolo�esa", "Fajitas de pollo", "Alubias con chorizo", "Pepito de ternera"};
						
			//Declaramos y poblamos el Array con los precios de los platos.
			
				int[] precios = {40,100,20,50,70,150,120,30};
			
			//Integramos ambos Arrays en un HashMap.
			
				HashMap<String, Integer> menu = new HashMap<String, Integer>();
				
				for(int i= 0; i < platos.length; i++){
					   menu.put(platos[i], precios[i]);
					}
			
			//Damos la bienvenida a los clientes.
			
				int vercarta = JOptionPane.showConfirmDialog(null,"Bienvenid@ al Restaurante Lara. \n�Deseas ver la carta?","Restaurante Lara",JOptionPane.YES_NO_OPTION); 	 
				
				if (vercarta == JOptionPane.NO_OPTION){
					System.out.println("De acuerdo, estoy en la barra si necesitas algo.");
				}
				
				if (vercarta == JOptionPane.YES_OPTION) {
					
					//Printamos el men� por consola.
						
					     Set<String> keys = menu.keySet();
					     Iterator<String> iter = keys.iterator();
					     
					     System.out.println("RESTAURANTE LARA\nMEN� A LA CARTA\nEscoge el plato deseado:\n");
					     
					     while(iter.hasNext()){
					        String key = iter.next();
			
					        System.out.println("\t" + key + ":\t\t" + menu.get(key) + " �");
					     }
				}
			     
			//Pasamos a tomarle nota al cliente.
			     
			     System.out.println("\nApuntaremos aqu� los platos que nos indiques:\n");
			     
			//Declaramos una variable que nos servir� para seguir iterando si el cliente desea m�s platos.
			     
			     int pedirmas = 0;
			     
			//Declaramos un ArrayList donde iremos almacenando los precios de cada plato pedido por el cliente.
			     
			     List<Integer> preciopedido = new ArrayList<Integer>();
			
			//Declaramos una variable donde se ir�n sumando esos precios.
					
				int subtotal = 0;
					
			//Lanzamos el bucle while, que tomar� nota de los platos que sucesivamente vaya pidiendo el cliente.
			//Tambi�n ir� almacenando los precios de los platos.
			//E ir� sum�ndolos en un subtotal.
			     
			     while (pedirmas == JOptionPane.YES_OPTION) {	
			    	 
				    String platopedido = (String) JOptionPane.showInputDialog(null, "Escoge el plato deseado:","Restaurante Lara", JOptionPane.QUESTION_MESSAGE, null, platos, platos[0]); 
					 
				    //Vamos poblando el ArrayList con los precios de cada plato pedido por el cliente.
				     
				    	preciopedido.add(menu.get(platopedido));

				    //Calculamos un subtotal, sumando esos precios.
				     
				    	subtotal = subtotal + menu.get(platopedido);
			        
				    //Le vamos recordando al cliente qu� es lo que ha ido pidiendo.
				     
				    	System.out.println("\t" + platopedido + ":\t\t" + menu.get(platopedido) + "�" + "\t\tSubtotal: " + subtotal + "�");
			        
				    //Le vamos preguntando al cliente si desea a�adir alg�n plato m�s. 
				
				    	pedirmas = JOptionPane.showConfirmDialog(null,"�Deseas pedir algo m�s?","Restaurante Lara",JOptionPane.YES_NO_OPTION);
			    	 
				     //Mientras (while) el cliente vaya diciendo que quiere pedir otro plato, el bucle seguir� iterando. 
				     //La condici�n de ruptura del bucle es que el cliente diga que no quiere pedir m�s platos.
			    	 
					    if (pedirmas == JOptionPane.NO_OPTION){
							System.out.println("\nGracias por tu pedido.\nTu cuenta asciende a " + subtotal + "�.");
						}
			     	}   
			    
				//El cliente ha solicitado todos los platos que deseaba.
			    //En la variable subtotal tenemos almacenado a cu�nto sube la cuenta.
			    //Vamos ahora a calcular la combinaci�n �ptima de billetes para pagar la cuenta.
				//Declaramos e inicializamos una variables para cada billete.
				
					int eu5 = 5;
					int eu10 = 10;
					int eu20 = 20;
					int eu50 = 50;
					int eu100 = 100;
					int eu200 = 200;
					int eu500 = 500;
				
				//Declaramos y poblamos un array con estos billetes.
				
					int[] billetes = new int[]{eu500, eu200, eu100, eu50, eu20, eu10, eu5};
				
				//Declaramos un array tan largo como diferentes billetes hay (7). 
				//Cada posici�n de este array est� relacionada con las posiciones del Array que contiene los valores de los billetes.
				//Con un bucle, lo poblaremos con n�meros correspondientes al n�mero de billetes de cada tipo.
				//Ejemplo: si usamos 2 billetes de 5�, billetes[0]=5 y billetesusados[0]=2.
				
					int[] billetesusados = new int[7];
				
				//Usamos un bucle for para calcular los billetes �ptimos (n�mero de billetes de cada tipo):
				
					for (int i = 0; i< 7; i++) {
						if (subtotal >= billetes[i]) {
							billetesusados[i] = subtotal/billetes[i];
							subtotal = subtotal - billetesusados[i] * billetes[i];
						}
					}
				
				//Usamos otro bucle for para printarlo por consola.
				
					System.out.println("\nTe recomendamos que pagues con estos billetes: ");
					
					for (int i=0; i<7; i++) {
						System.out.println("\t" + billetes[i] + "�:\t" + billetesusados[i] + " billete/s." );
					}
				
				//Printamos un mensaje de despedida.
				
					System.out.println("\n�Gracias por tu visita!\nEsperamos verte de nuevo muy pronto ;)" );
			     
		}
	}