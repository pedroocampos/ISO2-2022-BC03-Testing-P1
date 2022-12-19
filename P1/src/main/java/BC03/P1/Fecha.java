package BC03.P1;

public class Fecha {

	@SuppressWarnings("serial")
	class DatoInvalidoException extends Exception {
		public DatoInvalidoException(String msg) {
			super(msg);
		}
	}

	private int dia, mes, agno;

	public Fecha(int dia, int mes, int agno) throws DatoInvalidoException {
		this.setDia(dia);
		this.setMes(mes);
		this.setAgno(agno);
	}

	public void setDia(int dia) throws DatoInvalidoException {
		if (dia >= 1 && dia <= 31)
			this.dia = dia;
		else
			throw new DatoInvalidoException("El día debe ser un numero entre 1 y 31");
	}

	public void setMes(int mes) throws DatoInvalidoException {
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
		else
			throw new DatoInvalidoException("El mes debe ser un numero entre 1 y 12");
	}

	public void setAgno(int agno) throws DatoInvalidoException {
		if (agno >= 1)
			this.agno = agno;
		else
			throw new DatoInvalidoException("El año debe ser un numero positivo");
	}

	public boolean comprobarBisiesto() {
		boolean bisiesto = ((this.agno % 4 == 0) && (this.agno % 100 != 0) || (this.agno % 400 == 0));
		return bisiesto;
	}
}
