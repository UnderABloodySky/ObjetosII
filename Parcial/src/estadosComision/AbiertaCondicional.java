package estadosComision;

import comision.ComisionObj;

public class AbiertaCondicional extends EstadoEnComun {

	@Override
	public boolean estaDisponible(ComisionObj _comision) {
		return _comision.cantidadDeAlumnosEnEspera() < _comision.enEspera();
	}

	@Override
	public boolean cumplePara(ComisionObj _comision) {
		return _comision.cantidadDeAlumnos() - _comision.cantidadDeAlumnosEnEspera() < _comision.enEspera();
	}

}
