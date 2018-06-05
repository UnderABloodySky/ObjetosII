package estadosComision;

import comision.ComisionObj;
import persona.Persona;

public class Cerrada extends EstadoEnComun {

	@Override
	public boolean inscribir(Persona _persona, ComisionObj _comision) {
		return false; //Preguntar.
		//En realidad inscribir en este punto deberia ser imposible.
	}

	@Override
	public boolean estaDisponible(ComisionObj _comision) {
		return false;
	}

	@Override
	public boolean cumplePara(ComisionObj _comision) {
		return false;
	}

}
