/**
 * 
 */
package actividadElectrodomestico;

import java.util.Arrays;

/**
 * @author equipo_5
 * Superclase Electrodomestico.
 */
class Electrodomestico {
	//Constantes
	public final double PRECIO_BASE = 100;
	public final String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
	public final String COLOR_DEFAULT = "blanco";
	public final char [] VALORES_CONSUMO_ENERGETICO = {'A','B','C','D','E','F'};
	public final char CONSUMO_DEFAULT = 'F';
	public final double PESO_BASE = 5;
	
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructores
	//Contructor base con los atributos inicializados
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_BASE;
	}
	
	//Constructor con precioBase y peso como parámetros
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = peso;
	}
	
	//Constructor con precioBase, color, consumoEnergetico y peso (todos los atributos) como parámetros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
		//Llamada a métodos de control
		this.color = comprobarColor(this.color);
		this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
	}
	
	//Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	//Método control atributo color
	private String comprobarColor (String color) {
		
		color.toLowerCase();
		if (!(Arrays.asList(colores).contains(color)))
			color = COLOR_DEFAULT;
		
		return color;
		
	}
	
	//Método control atributo consumoEnergetico
	private char comprobarConsumoEnergetico (char consumoEnergetico) {
		boolean bien = false;
		
		for (int i = 0; i < VALORES_CONSUMO_ENERGETICO.length; i++) {
		if (consumoEnergetico == VALORES_CONSUMO_ENERGETICO[i]) {
			bien = true;
		}
		}
		
		if (bien == true) {
			return consumoEnergetico;
		}
		else {
			return CONSUMO_DEFAULT;
		}
	}
	
	//Método para modificar el precio final del producto en
	//función de su peso y de su consumoEnergético
	public double precioFinal(double precioInicial) {
		
		double precioFinal = precioInicial;;
		
		//Modificamos precio según consumoEnergetico
		switch (this.consumoEnergetico) {
			case 'A':
				precioFinal = precioInicial + 100;
				break;
			case 'B':
				precioFinal = precioInicial + 80;
				break;
			case 'C':
				precioFinal = precioInicial + 60;
				break;
			case 'D':
				precioFinal = precioInicial + 50;
				break;
			case 'E':
				precioFinal = precioInicial + 30;
				break;
			case 'F':
				precioFinal = precioInicial + 10;
		}
		
		//Modificamos precio según tamaño (peso)
		if (peso >= 0 && peso < 20)
			precioFinal += 10;
		else if (peso >= 20 && peso < 50)
			precioFinal += 50;
		else if (peso >= 50 && peso < 80)
			precioFinal += 80;
		else if (peso >= 80)
			precioFinal += 100;
		
		return precioFinal;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Electrodomestico [precio base=" + precioBase + ", color=" + color + ", consumo energético="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
