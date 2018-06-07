package sistema;

import java.util.ArrayList;
import java.util.List;

import articulos.Articulo;

public class SistemaDeReferencias {

	private List<Suscriptor> suscriptores;
	private List<Articulo> articulos;
	
		public SistemaDeReferencias() {
			suscriptores = new ArrayList<Suscriptor>();
			articulos = new ArrayList<Articulo>();
		}
		
		public void agregarSuscriptor(Suscriptor _suscriptor) {
			suscriptores.add(_suscriptor);
		}
		
		public void agregarArticulo(Articulo _articulo) {
			articulos.add(_articulo);
			this.notificar(_articulo);
		}
		
		private List<Suscriptor> suscriptoresQueLeInteresan(Articulo _articulo){
			List<Suscriptor> resultado = new ArrayList<Suscriptor>();
				for(Suscriptor _suscriptor : suscriptores) {
					if(_suscriptor.leInteresa(_articulo)) {
						resultado.add(_suscriptor);
					}
				}
				return resultado;
		}
		
		private void notificar(Articulo _articulo) {
			for(Suscriptor suscriptor : this.suscriptoresQueLeInteresan(_articulo)) {
				suscriptor.notificar();
			}
		}
		
		
}
