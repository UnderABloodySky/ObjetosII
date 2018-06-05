package estadosComision;

import comision.Comision;
import persona.Persona;

public abstract class EstadoEnComun implements EstadoComision {
	
	@Override
	public boolean inscribir(Persona _alumno, Comision _comision) {
		_comision.addAlumno(_alumno);
		return true;
	}
	
	@Override
	public void desinscribir(Persona _alumno, Comision _comision) {
		_comision.removeAlumno(_alumno);
	}

}
