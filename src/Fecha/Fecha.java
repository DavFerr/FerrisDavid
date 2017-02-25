package Fecha;
/**
 * Clase para crear y verificar fechas
 * 
 * @author David Ferris
 * 
 *
 */
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
/**
 * Constructor de Fecha
 * @param dia dia
 * @param mes mes
 * @param anio año
 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
/**
 * Metodo para comprobar si una fecha es válida o no
 * @return True si la fecha es válida y False si no lo es.
 */
	public boolean valida() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		if (anio < 0)
			return false;

		if (dia > diasMes())
			return false;
		else
			return true;
	}

	private int diasMes() {
		// determinamos la cantidad de días del mes:
		int diasMes = 0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			diasMes = 31;
		}
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
			diasMes = 31;
		}
		if (mes==2){
			if(bisiesto()){
				diasMes = 29;
			}else{
				diasMes = 28;
			}
		}

		return diasMes;
	}

	private boolean bisiesto() {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}


}
