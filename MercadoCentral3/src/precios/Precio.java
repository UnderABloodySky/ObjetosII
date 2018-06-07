package precios;

public abstract class Precio {
	
	private Float  valorNominal;
		
		public Precio(Float _valor) {
			valorNominal = _valor;
		}
			
			protected Float valor() {
				return valorNominal;
			}
			
			public abstract Float getPrecio();
}
