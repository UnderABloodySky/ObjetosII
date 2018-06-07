package sistema;

import java.util.List;

import articulos.Articulo;

public class Suscriptor {
	
	private List<String> intereses;
	private String nombre;

		public Suscriptor(List<String> _intereses, String _nombre){
			intereses = _intereses;
			nombre = _nombre;
		}
		
		public boolean leInteresa(Articulo _articulo) {
			boolean resultado = false;
			for(String interes : intereses) {
				resultado = resultado || _articulo.trataSobre(interes);
			}
			return resultado;
		}

		public void notificar() {
			
		}
}
