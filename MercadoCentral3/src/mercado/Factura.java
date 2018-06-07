package mercado;

import interfaces.Abonable;

public abstract class Factura implements Abonable{
	
	protected AgenciaRecaudadora agenciaRecaudadora;
	private Float valorDeterminado;
	
		public Factura(AgenciaRecaudadora _agencia, Float _valor) {
			agenciaRecaudadora = _agencia;
			valorDeterminado = _valor;
		}
	
			protected Float valorDeterminado() {
				return valorDeterminado;
			}
			
			public void notificarAgenciaRecaudadora() {
				agenciaRecaudadora.registrarPago(this);
			}

			@Override
			public Float montoAPagar() {
				return this.valorDeterminado();
			}
			
			@Override
			public void realizarPago() {
				agenciaRecaudadora.registrarPago(this);
			}

}
