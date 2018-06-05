package comision;

import java.util.ArrayList;
import java.util.List;

import estados.ControladorDeEstados;
import estadosComision.EstadoComision;
import persona.Persona;

public class ComisionObj implements Comision {

	private String nombre;
	private int cupo;	
	private int enEspera;
	private ControladorDeEstados control;
	private List<Persona> alumnos;
	
		public ComisionObj(String _nombre, int _cupo, int _enEspera) {
			nombre = _nombre;
			cupo = _cupo;
			enEspera = _enEspera;
			alumnos = new ArrayList<Persona>();
		}
			
			@Override
			public boolean inscribir(Persona _alumno) {
				return this.elEstadoQueDeterminaSuControl().inscribir(_alumno, this);
			}
		
			@Override
			public void desinscribir(Persona _alumno) {
				this.elEstadoQueDeterminaSuControl().desinscribir(_alumno, this);
			}
		
			@Override
			public boolean estaDisponible() {
				return this.elEstadoQueDeterminaSuControl().estaDisponible(this);
			}
			
			private EstadoComision elEstadoQueDeterminaSuControl() {
				return control.estadoPertenece(this);
			}
				
			public void addAlumno(Persona _alumno) {//Este no lo quiero publico, lo quiero visible solo para el controlador de estados
				alumnos.add(_alumno);
			}
			
			public void removeAlumno(Persona _alumno) {
				alumnos.remove(_alumno);
			}
			
			public int cupo() {
				return cupo;
			}
			
			public int enEspera(){
				return enEspera;
			}

			public int cantidadDeAlumnos() {
				return alumnos.size();
			}

			public int cantidadDeAlumnosEnEspera() {
				return this.alumnosEnEspera().size();
			}
			
			private List<Persona> alumnosEnEspera(){
				return alumnos.subList(cupo - 1, enEspera - 1);
			}
}
