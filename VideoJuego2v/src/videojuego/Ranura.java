package videojuego;

import java.util.ArrayList;
import java.util.List;

public class Ranura {
	
	private List<Ficha> fichas;
	
		public Ranura() {
			fichas = new ArrayList<Ficha>();
		}
		
			public void agregarFicha(Ficha _ficha) {
				fichas.add(_ficha);
			}
			
			public int cantidadDeFichas() {
				return fichas.size();
			}
			
			public void vaciar() {
				fichas.clear();
			}
}
