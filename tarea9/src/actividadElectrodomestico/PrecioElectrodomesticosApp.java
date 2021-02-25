/**
 * 
 */
package actividadElectrodomestico;

/**
 * @author equipo_5
 * Clase ejecutable que crea un vector de 10 electrodomésticos y calcula el precio de
 * los electrodomesticos, todos juntos, y las lavadoras y las televisiones por separado
 */
class PrecioElectrodomesticosApp {

	//Constante
	public final static int LONGITUD_VECTOR = 10;
	
	public static void main(String[] args) {
		//Variables
		Electrodomestico vectorElectrodomesticos[] = new Electrodomestico[LONGITUD_VECTOR];
		double sumaLavadora = 0;
		double sumaElectrodomestico = 0;
		double sumaTelevision = 0;
		
		//Llenamos el vectorElectrodomesticos
		vectorElectrodomesticos [0] = new Lavadora (100, "Blanco", 'A', 50, 40);
		vectorElectrodomesticos [1] = new Electrodomestico (50, "Rojo", 'B', 5);
		vectorElectrodomesticos [2] = new Television (150, "Negro", 'C', 20, 45, true);
		vectorElectrodomesticos [3] = new Television (150, "Azul", 'D', 15, 20, false);
		vectorElectrodomesticos [4] = new Lavadora (200, "Gris", 'A', 100, 40);
		vectorElectrodomesticos [5] = new Electrodomestico (50, "Blanco", 'E', 30);
		vectorElectrodomesticos [6] = new Electrodomestico (70, "Azul", 'F', 25);
		vectorElectrodomesticos [7] = new Television (120, "Blanco", 'B', 50, 35, true);
		vectorElectrodomesticos [8] = new Lavadora (100, "Negro", 'C', 70, 35);
		vectorElectrodomesticos [9] = new Electrodomestico (170, "Gris", 'A', 100);
		
		for (Electrodomestico e : vectorElectrodomesticos){
			if (e instanceof Lavadora) {
				sumaLavadora += e.precioFinal(e.getPrecioBase());
			}
			if (e instanceof Electrodomestico) {
				sumaElectrodomestico += e.precioFinal(e.getPrecioBase());
			}
			if (e instanceof Television) {
				sumaTelevision +=  e.precioFinal(e.getPrecioBase());;
			}
			System.out.println(e.toString());
			System.out.println();
	}
		System.out.println("El precio de todas las lavadoras és = " + sumaLavadora);
		System.out.println("El precio de todos los electrodomésticos és = " + sumaElectrodomestico);
		System.out.println("El precio de todas las televisiones és = " + sumaTelevision);
			
		}

}
