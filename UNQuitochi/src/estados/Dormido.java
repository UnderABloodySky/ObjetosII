package estados;

import uNQuitochi.*;

public class Dormido implements EstadoUnquitochi {
	
	public Dormido() {
		
	}

		@Override
		public void alimentar(UNQuitochi unQuitochi) {
			this.zzz(unQuitochi);
		}
		
		private void zzz(UNQuitochi unQuitochi) {
			unQuitochi.ponerEnPantalla(this.mensaje());
		}
		
		private String mensaje() {
			return "ZZZ";
		}
	
		@Override
		public void jugar(UNQuitochi unQuitochi) {
			this.zzz(unQuitochi);
		}
	
		@Override
		public void dormir(UNQuitochi unQuitochi) {
			//Si llega aca ya esta dormido.
			this.zzz(unQuitochi);	
		}
	
		@Override
		public void despertar(UNQuitochi unQuitochi) {
			unQuitochi.despertarse();
		}
	
		@Override
		public void accionar(UNQuitochi unQuitochi) {
			this.zzz(unQuitochi);	
		}	

}
