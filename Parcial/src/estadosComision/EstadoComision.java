package estadosComision;

import comision.ComisionObj;
import persona.Persona;

public interface EstadoComision {

	public boolean inscribir(Persona _persona, ComisionObj _comision);

	public void desinscribir(Persona _persona, ComisionObj _comision);
	
	public boolean estaDisponible(ComisionObj _comision);

	public boolean cumplePara(ComisionObj _comision);
	
}
