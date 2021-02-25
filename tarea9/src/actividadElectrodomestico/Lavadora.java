/**
 * 
 */
package actividadElectrodomestico;

/**
 * @author equipo_5
 * Subclase Lavadora.
 */
class Lavadora extends Electrodomestico{
	//Constante
	public final double CARGA_DEFAULT = 5;
	
	//Atributos
	private double carga;

	//Constructores
	//Constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA_DEFAULT;
	}
	
	//Constructor con precio, peso y carga pasados por prámetros
	public Lavadora(double precioBase, double peso, double carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	//Constructor con todos los atributos
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso,
			double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	//Getter y setter de carga
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	//Método padre precioFinal modificado para añadirle modificación de precio por carga
	public double precioFinal(double precioInicial) {
		
		double precioFinal = super.precioFinal(precioInicial);
		
		//Modificamos el precio en función de la carga
		if (carga > 30)
			precioFinal += 50;
		
		return precioFinal;
		
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Lavadora [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", carga=" + carga + "]";
	}

}
