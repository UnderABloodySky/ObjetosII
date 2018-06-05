package estados;

import uNQuitochi.UNQuitochi;

public class ConLaBocaAbierta implements EstadoUnquitochi {
	
	public ConLaBocaAbierta() {
		
	}

		@Override
		public void alimentar(UNQuitochi unQuitochi) {
			//Ya tiene la boca abierta. No se especifica que pasa. 	
		}
	
		@Override
		public void jugar(UNQuitochi unQuitochi) {
			unQuitochi.ponerseLaGorraParaJugar();
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
			unQuitochi.recibirPorcionDeAlimento();
		}

}
