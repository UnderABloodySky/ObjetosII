package videojuego;

import estado.Controlador;
import estado.EstadoArcade;
import estado.SinInicializar;

public class Videojuego {

	private Ranura ranura;
	private EstadoArcade estado;
	private Controlador control;
	
		public Videojuego() {
			ranura = new Ranura();
			this.setEstado(new SinInicializar());
			control = new Controlador();
		}
		
		
			public void inicio() {
				this.determinarEstado();
				estado.inicio(this);
			}

		
			private void determinarEstado(){
				control.determinadorEstado(this, ranura);
			}
		
			public void setEstado(EstadoArcade _estado) {
				estado = _estado;
			}
			
			public void gameOver() {
				this.volverAlInicio();
			}
			
			private void volverAlInicio() {
				ranura.vaciar();
				control.reiniciar(this);
			}


			public void mostrarEnPantalla(String mensaje) {
				//Muestra en pantalla el mensaje.
			}


			public void iniciarJuegoUnJugador() {
				this.activarControlesUnJugador();
				this.iniciarJuego();
			}

			public void iniciarJuegoDosJugadores() {
				this.activarControlesDosJugador();
				this.iniciarJuego();
			}

			private void activarControlesUnJugador() {
				//Activa los controles de un jugador.
			}

			private void activarControlesDosJugador() {
				//Activa los controles de dos jugadores.
			}
			
			private void iniciarJuego() {
				//Empieza el juego.
			}
			
}
