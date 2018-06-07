package mercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Producto> compra;
	private Float total;
	
		public Cliente() {
			total = new Float(0);
			compra = new ArrayList<Producto>(0);
		}

			public void comprar(Producto producto) {
				compra.add(producto);
			}
	
			public Float getTotal() {
				return total;
			}
	
			public List<Producto> compra() {
				return compra;
			}
	
			public void setTotal(Float _n) {
				total += _n; 
			}
}
