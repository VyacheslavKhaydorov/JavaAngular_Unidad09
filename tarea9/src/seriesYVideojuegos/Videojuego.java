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
	private String compañia;
	
	
	//Constructores
	public Videojuego() {
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
	//Métodos
	public String toString() {
		return "Título: " + titulo + " | Compañía: " + compañia + " | Género: " + genero
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
