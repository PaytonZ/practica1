package tiempo;

public class Reloj {
	
	Milisegundo m = new Milisegundo();
	UnidadTiempo segundo = new UnidadTiempo();
	UnidadTiempo minuto = new UnidadTiempo();
	UnidadTiempo hora = new UnidadTiempo();
	
	/**
	 * este metodo realiza la operacion de ir incrementando segundos, minutos y horas
	 */
	public void cuentaReloj()
	{
		segundo.incremento(m.devuelveSegundo());
		minuto.incremento(segundo.pasoUnidad(60));
		hora.incremento(minuto.pasoUnidad(60));
		
	}
	/**
	 * este metodo muestra por consola el cronometraje actual
	 */
	public void mostrarReloj()
	{
		int tiempo [] = new int [3];
		tiempo = devuelveTiempo();
		System.out.println("hora "+ tiempo[2] + " minuto " + tiempo[1] + " segundo " + tiempo[0]);
	}
	//devuelve un array con los segundos , minutos y horas cronometradas actuales
	
	/**
	 * este metodo devuelve el tiempo actual en un array , el cual contiene en
	 * tiempo[0] = segundos, tiempo[1] = minutos, tiempo[2] = horas
	 * @return
	 */
	public int [] devuelveTiempo ()
	{
		int tiempo [] = new int [3];
		tiempo[0] = segundo.getUnidad();
		tiempo[1] = minuto.getUnidad();
		tiempo[2] = hora.getUnidad();
		return tiempo;
	}
}
