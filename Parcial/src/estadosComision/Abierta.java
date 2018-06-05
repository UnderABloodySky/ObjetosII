package estadosComision;

import comision.Comision;

public class Abierta extends EstadoEnComun {

	@Override
	public boolean estaDisponible(Comision _comision) {
		return _comision.cantidadDeAlumnos() < _comision.cupo();
	}

	@Override
	public boolean cumplePara(Comision _comision) {
		return _comision.cantidadDeAlumnos() < _comision.cupo();
	}

}
