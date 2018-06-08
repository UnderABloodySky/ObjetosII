package sueldo;

public class EmpleadoTemporario extends Empleado {
	
	private boolean esCasadx;
	private boolean tieneHijxs;
	
		public EmpleadoTemporario(int _horas, Float _basico, boolean _es, boolean _tiene) {
			super(_horas, new Float(5), new Float(1000), new Float(100));
			this.esCasadx(_es);
			this.tieneHijxs(_tiene);
		}
		
			public void esCasadx(boolean es) {
				esCasadx = es;
			}
		
			public void tieneHijxs(boolean tiene) {
				tieneHijxs = tiene;
			}
			
			public boolean tieneHijxs() {
				return tieneHijxs; 
			}
			
			public boolean esCasadx() {
				return esCasadx;
			}
		
			@Override
			protected Float bonificacionesFamiliares() {
				Float total = new Float(0);
				if(this.esCasadx() || this.tieneHijxs()) { 
					total = bonificaciones;
				}
				return total;
			}
}
