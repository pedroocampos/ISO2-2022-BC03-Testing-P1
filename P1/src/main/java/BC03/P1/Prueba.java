package BC03.P1;

import java.util.*;

import BC03.P1.Fecha.DatoInvalidoException;

public class Prueba {
// Ejemplo de clase para ejecutar la clase Fecha
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws DatoInvalidoException {
		Fecha fecha = pedirDatos();
		fecha.comprobarBisiesto();
	}

	public static Fecha pedirDatos() throws DatoInvalidoException {
		Fecha fecha = null;
		
		try {
			System.out.print("Día ");
			int dia = sc.nextInt();
			System.out.print("Mes ");
			int mes = sc.nextInt();
			System.out.print("Año ");
			int agno = sc.nextInt();
			System.out.print("\n");
			fecha = new Fecha(dia, mes, agno);
		} catch(InputMismatchException e) {
			System.out.println("Los datos no pueden ser letras o decimales");
		}
		
		return fecha;
	}
}
