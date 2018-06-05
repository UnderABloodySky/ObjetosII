package solicitud;

import cliente.Cliente;
import credito.Credito;

public abstract class Solicitud {
	
	protected Cliente cliente;
	protected Float monto;
	protected Integer cantidadDeCuotas;

		public Solicitud(Cliente _cliente, Float _monto, Integer _cantidadDeCuotas) {
			cliente = _cliente;
			monto = _monto;
			cantidadDeCuotas = _cantidadDeCuotas;
		}
		
			public Boolean esAceptada() {
				return this.verLoPropio();
			}
			
			public Float montoDeLaCuota() {
				return monto / cantidadDeCuotas;
			}
						
			protected Cliente getCliente() {
				return cliente;
			}
			
			public Float getMonto() {
				return monto;
			}
			
			protected Integer getCantidadDeCuotas() {
				return cantidadDeCuotas;
			}

			protected Boolean montoDeLaCuotaEsMayorA(Float _n) {
				return this.montoDeLaCuota() >= _n; 
			}
			
			protected Float porcientoDelMontoMensualDelCliente(Float _porciento) {
				return cliente.getSueldoNetoMensual() * _porciento / new Float(100);
			}
			
			protected void darCreditoACliente() {
				cliente.agregarCredito(new Credito(this));
			}

			protected abstract Boolean verLoPropio();
			
}