package sueldo;

public class EmpleadoPlanta extends Empleado {
	
	private int cantidadHijos;

		public EmpleadoPlanta(int horas, int _cantidad) {
			super(horas, new Float(0), new Float(3000), new Float(150));
			this.setCantidadDeHijxs(_cantidad);
		}
	
			private void setCantidadDeHijxs(int _cantidad) {
				cantidadHijos = _cantidad;
			}
		
			@Override
			protected Float bonificacionesFamiliares() {
				return bonificaciones * cantidadHijos;
			}

}
