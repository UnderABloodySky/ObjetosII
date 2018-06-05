package banco;

import java.util.ArrayList;
import java.util.List;
import cliente.Cliente;
import solicitud.Solicitud;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Solicitud> solicitudes;

		public Banco() {
			clientes = new ArrayList<Cliente>();
			solicitudes = new ArrayList<Solicitud>();
		}

		public List<Cliente> getClientes() {
			return clientes;
		}

		public List<Solicitud> getSolicitudes() {
			return solicitudes;
		}
		
		public void agregarsolicitud(Solicitud _solicitud) {
			solicitudes.add(_solicitud);
		}
		
		public void agregarCliente(Cliente _cliente) {
			clientes.add(_cliente);
		}
		
		public void evaluarSolicitudes() {
			for(Solicitud solicitud : solicitudes) {
				if(! solicitud.esAceptada()) {
					this.filtrarSolicitud(solicitud);
				}
			}
		}
		
		private void filtrarSolicitud(Solicitud solicitud) {
			solicitudes.remove(solicitud);
		}

		public Boolean esSolicitudAceptada(Solicitud solicitud) {
			return solicitud.esAceptada();
		}
		
		public Float montoTotalDeDineroDesembolsado() {
			Float total = new Float(0);
			
				for(Solicitud solicitud : solicitudes) {
					if(solicitud.esAceptada()) {
						total += solicitud.getMonto();
					}
				}
			
			return total; 
		}
}
