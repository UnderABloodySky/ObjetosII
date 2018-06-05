package estados;

import uNQuitochi.UNQuitochi;

public class Muerto implements EstadoUnquitochi{
	
	public Muerto() {
		
	}

		private void rip(UNQuitochi unQuitochi) {
			unQuitochi.ponerEnPantalla(this.mensaje());
		}
		
		private String mensaje() {
			return "RIP";
		}
	
		@Override
		public void alimentar(UNQuitochi unQuitochi) {
			this.rip(unQuitochi);	
		}
	
		@Override
		public void jugar(UNQuitochi unQuitochi) {
			this.rip(unQuitochi);
		}
	
		@Override
		public void dormir(UNQuitochi unQuitochi) {
			this.rip(unQuitochi);
		}
	
		@Override
		public void despertar(UNQuitochi unQuitochi) {
			this.rip(unQuitochi);
		}
	
		@Override
		public void accionar(UNQuitochi unQuitochi) {
			this.rip(unQuitochi);	
		}

}
