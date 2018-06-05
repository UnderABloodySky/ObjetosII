package estado;

import videojuego.Ranura;
import videojuego.Videojuego;

public class Controlador {
		
	private int cantidadFichasSinglePlayer = 1;
	private int cantidadFichasMultiPlayer = 2;
		
		
		public void determinadorEstado(Videojuego videojuego, Ranura ranura) {
			if(ranura.cantidadDeFichas() == cantidadFichasSinglePlayer) {
				videojuego.setEstado(new SinglePlayer());
			}
			else {
				if(ranura.cantidadDeFichas() == cantidadFichasMultiPlayer) {
					videojuego.setEstado(new MultiPlayer());
				}
			}
		}
		
		public void setCantidadFichasSinglePlayer(int _n) {
			cantidadFichasSinglePlayer = _n;
		}
		
		public void setCantidadFichasMultiPlayer(int _n) {
			cantidadFichasMultiPlayer = _n;
		}

		public void reiniciar(Videojuego _videojuego) {
			_videojuego.setEstado(new SinInicializar());			
		}
		
}
