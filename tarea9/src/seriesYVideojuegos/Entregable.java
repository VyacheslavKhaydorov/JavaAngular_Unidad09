/**
 * 
 */
package seriesYVideojuegos;

/**
 * @author viach
 * Interfaz Entregable
 */
interface Entregable {

	//M�todos
	void entregar();		//this.prestado = true;
	
	void devolver();		//this.prestado = false;
	
	void isEntregado();		//Estado del atributo prestado
	
	int compareTo(Object a);//Comparamos las horas estimadas en los videojuegos y el n�mero
							//de temporadas en las series
	
}
