package precios;

import precios.Precio;

public class PrecioEmpresarial extends Precio {

	public PrecioEmpresarial(Float _valor) {
		super(_valor);
	}

		@Override
		public Float getPrecio() {
			return this.valor();
		}

}
