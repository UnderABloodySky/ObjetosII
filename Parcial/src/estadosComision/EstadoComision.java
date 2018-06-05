package estadosComision;

import comision.Comision;
import persona.Persona;

public interface EstadoComision {

	public boolean inscribir(Persona _persona, Comision _comision);

	public void desinscribir(Persona _persona, Comision _comision);
	
	public boolean estaDisponible(Comision _comision);

	public boolean cumplePara(Comision _comision);
	
}
