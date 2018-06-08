package sueldo;

public abstract class Empleado implements IEmpleado {
	
	private int cantidadHoras;
	private Float precioPorHora;
	private Float basico;
	protected Float bonificaciones;
	protected Float obraSocial;

		public Empleado(int horas, Float precio, Float _basico, Float _bonificaciones) {
			this.setHoras(horas);
			this.setPrecioPorHora(precio);
			this.setBonificaciones(_bonificaciones);
			obraSocial = new Float(0.13);
		}
			
			public void setHoras(int _horas) {
				cantidadHoras = _horas;
			}
			
			public void setPrecioPorHora(Float precio) {
				precioPorHora = precio;
			}
			
			public void setBasico(Float _basico) {
				basico = _basico;
			}
			
			public void setBonificaciones(Float _bonificaciones) {
				bonificaciones = _bonificaciones;
			}
			
			public void setObraSocialYAporte(float _porcentaje) {
				obraSocial = _porcentaje;
			}
		
			@Override
			public Float sueldo() {
				return this.cantidadPorHoras() + this.basico() + this.bonificacionesFamiliares()- this.aportesYObraSocial();
			}
			
			protected Float gananciaBruta() {
				return this.cantidadPorHoras() + this.basico() + this.bonificacionesFamiliares();
			}
			
			protected Float cantidadPorHoras() {
				return cantidadHoras * precioPorHora;
			}
			
			protected Float basico() {
				return basico;
			}
			
			protected abstract Float bonificacionesFamiliares();
			
			protected Float aportesYObraSocial() {
				return this.gananciaBruta() * obraSocial;
			}
}