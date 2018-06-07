package mercado;

import java.util.ArrayList;
import java.util.List;

import interfaces.Agencia;

public class AgenciaRecaudadora implements Agencia{
	
	private List<Factura> facturasPagas;
	
		public AgenciaRecaudadora(){
			facturasPagas = new ArrayList<Factura>();
		}
		
		private void agregarFacturaPaga(Factura _factura) {
			facturasPagas.add(_factura);
		}
		
		@Override
		public void registrarPago(Factura factura) {
			this.agregarFacturaPaga(factura);
		}
		
}
