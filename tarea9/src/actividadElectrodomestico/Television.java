/**
 * 
 */
package actividadElectrodomestico;

/**
 * @author viach
 * Subclase Television.
 */
class Television extends Electrodomestico {
	//Constantes
	public final double RESOLUCION_DEFAULT = 20;
	public final boolean SINTONIZADOR_TDT_DEFAULT = false;
	
	//Atributos
	private double resolucion;
	private boolean sintonizadorTDT;
	
	//Constructores
	//Constructor por defecto
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}
	
	//M�todo con precio y peso por par�metros
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}
	
	//M�todo con todos los atributos por par�metros
	public Television(double precioBase, String color, char consumoEnergetico, double peso,
			double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	//Getters y setters de resolucion y sintonizadorTDT
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	//M�todo padre precioFinal modificado para a�adirle modificaci�n de precio por resolucion
	//y sintonizadorTDT incorporado
	public double precioFinal() {
		super.precioFinal();
		
		//Modificamos el precio en funci�n de la resolucion
		if (resolucion > 40)
			this.precioBase += this.precioBase * 0.3;
		//MOdificamos el precio si incorpora el sintonizadorTDT
		if (sintonizadorTDT)
			this.precioBase += 50;
		
		return this.precioBase;
	}
	
}
