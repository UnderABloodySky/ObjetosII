package estado;

import videojuego.Videojuego;

public class SinglePlayer extends EstadoArcade {

	@Override
	public void inicio(Videojuego _videojuego) {
		_videojuego.iniciarJuegoUnJugador();
	}

}
