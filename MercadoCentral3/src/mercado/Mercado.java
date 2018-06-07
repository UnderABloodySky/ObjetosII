package mercado;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.List;
import java.util.Map;

public class Mercado {
	//private List<Par<Producto, Integer>>  productosEnStock;
	private Map<Producto, Integer> productosEnStock;
	//Completitud: private List<Caja> cajas;
	
		public Mercado() { 
			productosEnStock = new HashMap<Producto, Integer>();
			//cajas = new ArrayList<Caja>();
		}
	
			public void agregarProducto(Producto _producto, Integer _cantidad) {
				productosEnStock.put(_producto, _cantidad);
			}
	
			public void sacarDeStock(Producto productoAFiltrar) {
					if(this.hayStockDe(productoAFiltrar)) {
						this.borrarUnidad(productoAFiltrar);
					}
			}
			
			private boolean hayStockDe(Producto _producto) {
				return this.seComercializa(_producto) && this.hayAlgun(_producto);
			}
			
			private boolean seComercializa(Producto _producto) {
				return productosEnStock.containsKey(_producto);
			}
			
			private boolean hayAlgun(Producto _producto) {
				return productosEnStock.get(_producto) > new Integer(0);
			}
			
			private void borrarUnidad(Producto _producto) {
				modificarUnidadesEn(_producto, new Integer(-1));
			}
			
			private void cambiarCantidad(Producto _producto, Integer _cantidad) {
				productosEnStock.put(_producto, _cantidad);
			}

			private Integer calcularN(Integer _n1, Integer _n2) {
				return _n1 + _n2;
			}
			
			private Integer cantidad(Producto _producto){
				return productosEnStock.get(_producto);
			}
			
			private void modificarUnidadesEn(Producto _producto, Integer _integer) {
				this.cambiarCantidad(_producto, this.calcularN(this.cantidad(_producto), _integer));
			}

			public void desestockear(List<Producto> compra) {
				for(Producto producto : compra) {
					this.sacarDeStock(producto);
				}
				
			}
			
}
