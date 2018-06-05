package estados;

import java.util.ArrayList;
import java.util.List;
import comision.Comision;
import estadosComision.*;

public class ControladorDeEstados {
	
	private List<EstadoComision> posiblesEstados;
		
		public ControladorDeEstados() {
			posiblesEstados = new ArrayList<EstadoComision>(); //Nace con una coleccion vacia de estados.
			this.addEstado(new Abierta());
			this.addEstado(new AbiertaCondicional());
			this.addEstado(new Cerrada());
		}
			
		public ControladorDeEstados(List<EstadoComision> _estados) {
			posiblesEstados = _estados;
		}
			
		public void addEstado(EstadoComision _estado) {
			posiblesEstados.add(_estado);
		}
			
		public void removeEstado(EstadoComision _estado) {
			posiblesEstados.remove(_estado);
		}
	
		public EstadoComision estadoPertenece(Comision _comision) { //Preguntar: Como hacer para recordar el ultimo estado.
																	   //
			EstadoComision resultado = posiblesEstados.get(0);		   //Alguna otra forma de inicializar el estado? un NUll object?.
			                                						   //
			for(EstadoComision estado : posiblesEstados) {			   //No quiero recorrerlos todos, como cortarlo antes.
				if(estado.cumplePara(_comision)) {
					resultado = estado;
				}
			}
			return resultado;
		}

}
