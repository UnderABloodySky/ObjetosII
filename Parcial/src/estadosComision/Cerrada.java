package estadosComision;

import comision.Comision;
import persona.Persona;

public class Cerrada extends EstadoEnComun {

	@Override
	public boolean inscribir(Persona _persona, Comision _comision) {
		return false; //Preguntar.
		//En realidad inscribir en este punto deberia ser imposible.
	}

	@Override
	public boolean estaDisponible(Comision _comision) {
		return false;
	}

	@Override
	public boolean cumplePara(Comision _comision) {
		return false;
	}

}
