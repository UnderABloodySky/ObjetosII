package comision;

import persona.Persona;

public interface IComision {
	
	public boolean inscribir (Persona _persona);
	
	public void desinscribir(Persona _persona);
	
	public boolean estaDisponible();

}
