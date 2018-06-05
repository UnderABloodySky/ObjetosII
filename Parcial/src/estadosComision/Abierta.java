package estadosComision;

import comision.ComisionObj;

public class Abierta extends EstadoEnComun {

	@Override
	public boolean estaDisponible(ComisionObj _comision) {
		return _comision.cantidadDeAlumnos() < _comision.cupo();
	}

	@Override
	public boolean cumplePara(ComisionObj _comision) {
		return _comision.cantidadDeAlumnos() < _comision.cupo();
	}

}
