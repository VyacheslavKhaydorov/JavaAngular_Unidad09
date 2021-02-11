/**
 * 
 */
package seriesYVideojuegos;

/**
 * @author viach
 * Clase Videojuego
 */
class Videojuego {
	
	//Atributos
	private String titulo;
	private int horasEstimadas;
	private boolean prestado;
	private String genero;
	private String compa�ia;
	
	
	//Constructores
	public Videojuego() {
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}

	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	
	//M�todos
	public String toString() {
		return "T�tulo: " + titulo + " | Compa��a: " + compa�ia + " | G�nero: " + genero
				+ " | Horas estimadas: " + horasEstimadas + " | Prestado: " + prestado;
	}
	
	public void entregar() {
		this.prestado = true;
	}		
	
	void devolver() {
		this.prestado = false;
	}
	
	void isEntregado() {
		System.out.println("Prestado: " + prestado);
	}
	
	int compareTo(Object a) {
		//Variables
		int valorComparativa;
		
		
		return valorComparativa;
	}
}
