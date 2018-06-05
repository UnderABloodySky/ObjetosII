package estados;

import uNQuitochi.UNQuitochi;

public class ConLaGorra implements EstadoUnquitochi {
	
	public ConLaGorra() {
		
	}

		@Override
		public void alimentar(UNQuitochi unQuitochi) {
			unQuitochi.abrirLaBoca();
		}
	
		@Override
		public void jugar(UNQuitochi unQuitochi) {
			//No especifica - Ya esta Con la gorra puesta.
		}
	
		@Override
		public void dormir(UNQuitochi unQuitochi) {
			unQuitochi.dormirse();
		}
	
		@Override
		public void despertar(UNQuitochi unQuitochi) {
			//No hace nada - No esta dormido.
		}
	
		@Override
		public void accionar(UNQuitochi unQuitochi) {
			unQuitochi.buscarJuguete();
		}	

}
