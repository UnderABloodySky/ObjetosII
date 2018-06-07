package mercado;

import interfaces.Abonable;
import interfaces.Agencia;

public class Caja implements Agencia{

	private Mercado mercado;

		public Caja(Mercado _mercado) {
			mercado = _mercado;
		}

			private Float total(Cliente _cliente) {
				Float total = new Float(0);
					for (Producto producto : _cliente.compra())
						total += producto.precio();
				return total;
			}
			
			public void registrarCobro(Cliente _cliente){
				_cliente.setTotal(this.total(_cliente));
				mercado.desestockear(_cliente.compra());
			}
			
			public void registrarPago(Cliente _cliente, Abonable loQueQuieraPagar) {
				loQueQuieraPagar.realizarPago();
			}
			
			@Override
			public void registrarPago(Factura factura) {
				factura.notificarAgenciaRecaudadora();
			}
			
}
