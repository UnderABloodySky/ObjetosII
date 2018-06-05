package comision;

import persona.Persona;

public interface Comision {
	
	public boolean inscribir (Persona _persona);
	
	public void desinscribir(Persona _persona);
	
	public boolean estaDisponible();

}
