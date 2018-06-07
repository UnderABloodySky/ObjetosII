package mercado;

import interfaces.Abonable;
import precios.Precio;

public class Producto implements Abonable{
	
	private String nombre;
	private Precio precio;
	private Cliente cliente;
	
		public Producto(Cliente _cliente, String _nombre, Precio _precio){
			cliente = _cliente;
			nombre = _nombre;
			precio = _precio;
		}
	
		public String getNombre(){
			return nombre;
		}
		
		public Float precio() {
			return this.getPrecio();
		}
	
		private Float getPrecio(){
			return precio.getPrecio();
		}
		
		/*Agregado solo por flexibilidad
		public void setPrecio(Precio _newPrice){
			precio = _newPrice;
		}
		*/
	
		@Override
		public void realizarPago() {
			cliente.comprar(this);
		}
	
		@Override
		public Float montoAPagar() {
			return this.getPrecio();
		}
}
