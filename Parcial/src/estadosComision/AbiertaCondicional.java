package estadosComision;

import comision.Comision;

public class AbiertaCondicional extends EstadoEnComun {

	@Override
	public boolean estaDisponible(Comision _comision) {
		return _comision.cantidadDeAlumnosEnEspera() < _comision.enEspera();
	}

	@Override
	public boolean cumplePara(Comision _comision) {
		return _comision.cantidadDeAlumnos() - _comision.cantidadDeAlumnosEnEspera() < _comision.enEspera();
	}

}
