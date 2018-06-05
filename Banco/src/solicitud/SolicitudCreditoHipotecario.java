package solicitud;

import cliente.Cliente;
import credito.Credito;
import propiedad.Propiedad;

public class SolicitudCreditoHipotecario extends Solicitud{

	private Propiedad propiedad;
	private Float minimo;
	
		public SolicitudCreditoHipotecario(Cliente _cliente, Float _monto, Integer _cantidadDeCuotas, Propiedad _propiedad) {
				super(_cliente, _monto, _cantidadDeCuotas);
				propiedad = _propiedad;
				minimo = new Float(50);
		}
		
			@Override
			protected Boolean verLoPropio() {
				return this.montoDeLaCuotaNoExcedeEl50Porciento() && this.montoTotalSolicitadoNoSeaMayorAl70PorcientoDelValorDeLaPropiedad();
			}
			
			public Propiedad getPropiedad() {
				return propiedad;
			}
			
			private Boolean montoDeLaCuotaNoExcedeEl50Porciento() {
				
				return this.montoDeLaCuotaEsMayorA(porcientoDelMontoMensualDelCliente(minimo));
			}
			
			private Boolean montoTotalSolicitadoNoSeaMayorAl70PorcientoDelValorDeLaPropiedad() {
				return this.getMonto() < this.SetentaPorcientoDelValorFiscalDeLaPropiedad();
			}

			private Float SetentaPorcientoDelValorFiscalDeLaPropiedad() {
				return propiedad.getValorFiscal() * new Float(70) / new Float(100);
			}
			
}