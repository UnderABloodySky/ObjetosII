package sueldo;

public class Pasante extends Empleado{

	public Pasante(int horas) {
		super(horas, new Float(40), new Float(0), new Float(0));
	}

		@Override
		protected Float bonificacionesFamiliares() {
			return new Float(0);
		}

}
