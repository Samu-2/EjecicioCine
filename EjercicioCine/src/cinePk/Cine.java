package cinePk;

public class Cine {
/**
 * numero de personas
 * int
 */
	protected int aforo;
	/**
	 * butacas que ya han sido vendidas
	 * int
	 */
	protected int butacasOcupadas;
	/**
	 * titulo de la pelicula
	 *  String 
	 */
	protected String tituloPelicula;
	/**
	 * precio entrada
	 * int
	 */
	protected double precioEntrada;
	/**
	 * constructor con 3 parametros(completo)
	 * @param int aforo
	 * @param String tituloPelicula
	 * @param  double precioEntrada
	 */

	public Cine(int aforo, String tituloPelicula, double precioEntrada) {
		super();
		this.aforo =aforo; 
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
		this.butacasOcupadas=0;
	}
/**
 * constructor solo con aforo
 * @param int aforo
 */
	public Cine(int aforo) {
		super();

		this.aforo =aforo;
		this.tituloPelicula = "Sin determinar";
		this.precioEntrada = 5;
		this.butacasOcupadas=0;
	}
	/**
	 * constructor vacio
	 */
	public Cine() {
		super();
		this.aforo = 100;
		this.tituloPelicula = "Sin determinar";
		this.precioEntrada = 5;
		this.butacasOcupadas=0;
	}
	/**
	 * devuelve aforo
	 * @return int aforo
	 */
	public int getAforo() {
		return aforo;
	}
	/**
	 * cambiar aforo
	 * @param int aforo
	 */
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	/**
	 * devuelve butacasOcupadas
	 * @return int butacasOcupadas
	 */
	public int getButacasOcupadas() {
		return butacasOcupadas;
	}
	/**
	 * cambiar butacas ocupadas
	 * @param int butacasOcupadas
	 */
	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}
	/**
	 * decuelve el titulo pelicula
	 * @return String tituloPelicula
	 */
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	/**
	 * cambiar tituloPelicula
	 * @param String tituloPelicula
	 */
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	/**
	 * d3vuelve precioEntrada
	 * @return int precioEntrada
	 */
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	/**
	 * cambiar precioEntrada
	 * @param int precioEntrada
	 */
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	/**
	 * butacasLibres
	 * @return int numero de butacas libres
	 */
	public int butacasLibres() {
		return aforo-butacasOcupadas;
	}
	/**
	 * 
	 * @return porcentaje de butacas ocupadas
	 */
	public double porcentajeOcupacion() {
		return (butacasOcupadas/(double)aforo)*100;
		
	}
	/**
	 * 
	 * @return int ingresos por venta de entradas
	 */
	
	public double ingresosSala() {
		return precioEntrada*butacasOcupadas;
	}
	/**
	 * vaciar la sala
	 */
	public void vaciarSala() {
		setButacasOcupadas(0);
	}
	/**
	 * se ocupa una butaca mas
	 */
	public void venderEntrada() {
		butacasOcupadas=butacasOcupadas+1;
	}
	/**
	 * se resta 1 a butacas ocupadas
	 */
	public void devolverEntrada() {
		butacasOcupadas=butacasOcupadas-1;
	}
	
	/***
	* to string completo
	 */
	
	
	@Override
	public String toString() {
		return "Cine [aforo=" + aforo + ", butacasOcupadas=" + butacasOcupadas + ", tituloPelicula=" + tituloPelicula
				+ ", precioEntrada=" + precioEntrada + "]";
	}

}
