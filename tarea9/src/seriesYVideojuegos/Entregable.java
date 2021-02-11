/**
 * 
 */
package seriesYVideojuegos;

/**
 * @author viach
 * Interfaz Entregable
 */
interface Entregable {

	//Métodos
	void entregar();		//this.prestado = true;
	
	void devolver();		//this.prestado = false;
	
	void isEntregado();		//Estado del atributo prestado
	
	int compareTo(Object a);//Comparamos las horas estimadas en los videojuegos y el número
							//de temporadas en las series
	
}
