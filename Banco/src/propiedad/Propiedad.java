package propiedad;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private Integer valorFiscal;
	
		public Propiedad(String _descripcion, String _direccion, Integer _valorFiscal) {
			descripcion = _descripcion;
			direccion = _direccion;
			valorFiscal= _valorFiscal;
		}

			public String getDescripcion() {
				return descripcion;
			}
	
			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}
	
			public String getDireccion() {
				return direccion;
			}
	
			public void setDireccion(String direccion) {
				this.direccion = direccion;
			}
	
			public Integer getValorFiscal() {
				return valorFiscal;
			}
	
			public void setValorFiscal(Integer valorFiscal) {
				this.valorFiscal = valorFiscal;
			}
}
