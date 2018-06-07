package precios;

import precios.Precio;

public class PrecioCooperativo extends Precio{
	Float porcentajeDescuento;
	
		public PrecioCooperativo(Float _valor) {
			super(_valor);
			porcentajeDescuento = new Float(10);
		}

		public PrecioCooperativo(Float _valor, Float _descuento) {
			super(_valor);
			porcentajeDescuento = _descuento;
		}
	
			@Override
			public Float getPrecio() {
				return this.precioConDescuento();
			}
			
			private Float precioConDescuento() {
				return this.precioBase() - this.descuento(); 
			}
			
			private Float descuento() {
				return (this.precioBase() * this.porcentajeDescuento())/new Float(100);
			}

			private Float porcentajeDescuento() {
				return porcentajeDescuento;
			}

			private Float precioBase() {
				return this.valor();
			}
}
