package solicitud;

import cliente.Cliente;

public class SolicitudCreditoPersonal extends Solicitud{
	
	Float minimoIngresoAnual;
	Float porcentajeMinimo;
	
	public SolicitudCreditoPersonal(Cliente _cliente, Float _monto, Integer _cantidadDeCuotas) {
		super(_cliente, _monto, _cantidadDeCuotas);
		minimoIngresoAnual = new Float(15000);
		porcentajeMinimo = new Float(70);
	}
	
		@Override
		protected Boolean verLoPropio() {
			return this.clientetieneIngresosAnualesA15000() & this.montoDeLaCuotaNoExcedeEl70Porciento();
		}
		
		private Float minimoIngresoAnual() {
			return minimoIngresoAnual;
		}
		
		private Boolean clientetieneIngresosAnualesA15000() {
			return cliente.sueldoNetoAnual() > this.minimoIngresoAnual();
		}
		
		private Boolean montoDeLaCuotaNoExcedeEl70Porciento() {
			return this.montoDeLaCuotaEsMayorA(this.porcientoDelMontoMensualDelCliente(porcentajeMinimo));
		}
}