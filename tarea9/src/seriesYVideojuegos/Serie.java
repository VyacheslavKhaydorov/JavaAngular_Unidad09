/**
 * 
 */
package seriesYVideojuegos;

/**
 * @author viach
 * Clase Serie
 */
class Serie {
	
	//Atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean prestado;
	private String genero;
	private String creador;
	
	
	//Constructores
	public Serie() {
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}


	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}


	//Getters y setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}


	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	//Métodos
	public String toString() {	//@override
		return "Título: " + titulo + " | Creador: " + creador + " | Género: " + genero
				+ " | Número de temporadas: " + numeroTemporadas + " | Prestado: " + prestado;
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
