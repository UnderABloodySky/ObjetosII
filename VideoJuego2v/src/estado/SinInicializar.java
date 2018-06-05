package estado;

import videojuego.Videojuego;

public class SinInicializar extends EstadoArcade {

	@Override
	public void inicio(Videojuego _videojuego) {
		_videojuego.mostrarEnPantalla(this.mensaje());
	}
	
	private String mensaje() {
		return "Por favor, ingrese fichas";
	}

}
