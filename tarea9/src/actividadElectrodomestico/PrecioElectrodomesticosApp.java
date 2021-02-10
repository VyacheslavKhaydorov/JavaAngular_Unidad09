/**
 * 
 */
package actividadElectrodomestico;

import java.util.Scanner;

/**
 * @author viach
 * Clase ejecutable que crea un vector de 10 electrodom�sticos y calcula el precio de
 * los electrodomesticos, todos juntos, y las lavadoras y las televisiones por separado
 */
class PrecioElectrodomesticosApp {

	//Constante
	public final static int LONGITUD_VECTOR = 10;
	
	public static void main(String[] args) {
		//Variables
		Electrodomestico vectorElectrodomesticos[] = new Electrodomestico[LONGITUD_VECTOR];
		
		//Llenamos el vectorElectrodomesticos
		vectorElectrodomesticos[0] = new Electrodomestico();
		vectorElectrodomesticos[1] = new Electrodomestico();
		vectorElectrodomesticos[2] = new Electrodomestico();
		vectorElectrodomesticos[3] = new Electrodomestico();
		vectorElectrodomesticos[4] = new Electrodomestico();
		vectorElectrodomesticos[5] = new Electrodomestico();
		vectorElectrodomesticos[6] = new Electrodomestico();
		vectorElectrodomesticos[7] = new Electrodomestico();
		vectorElectrodomesticos[8] = new Electrodomestico();
		vectorElectrodomesticos[9] = new Electrodomestico();
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos por teclado
		System.out.println("Introduce las caracter�sticas de 10 electrodom�sticos:");
		for (int i = 0; i < vectorElectrodomesticos.length; i++) {
			introduceElectrodomestico();
			System.out.println("Quedan " + (vectorElectrodomesticos.length - 1 - i) + " electrodom�sticos "
					+ "por introducir.");
		}
		
		//Salida por consola
		
		
	}
	
	//M�todo de entrada de datos
	public static void introduceElectrodomestico () {
		System.out.println("Qu� electrodom�stico vas a ");
		
		
	}
	
	//M�todo para mostrar un vector de objetos por consola
	/*public static void mostrarObjetos (Electrodomestico vectorObjetos[]) {
		for (Electrodomestico electrodomestico: vectorObjetos[])
			System.out.println(electrodomestico.getPrecioBase(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso());
	
	}*/

}
