package cliente;

import java.util.ArrayList;
import java.util.List;

import banco.Banco;
import credito.Credito;
import solicitud.Solicitud;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Float sueldoNetoMensual;
	private List<Credito> creditos; 
	
		public Cliente(String _nombre, String _apellido, String _direccion, Integer _edad, Float _sueldo) {
			nombre = _nombre;
			apellido = _apellido; 
			direccion = _direccion;
			edad = _edad;
			sueldoNetoMensual = _sueldo;
			creditos = new ArrayList<Credito>();
		}

			public String getNombre() {
				return nombre;
			}
	
			public String getApellido() {
				return apellido;
			}
	
			public String getDireccion() {
				return direccion;
			}
	
			public Integer getEdad() {
				return edad;
			}
	
			public Float getSueldoNetoMensual() {
				return sueldoNetoMensual;
			}
	
			public Float sueldoNetoAnual() {
				Float meses = new Float (13);
					return this.getSueldoNetoMensual() * meses;
			}
			
			public void agregarCredito(Credito _credito) {
				creditos.add(_credito);
			}
			
			public void presentarSolicitud(Banco _banco, Solicitud _solicitud) {
				_banco.agregarsolicitud(_solicitud);
			}
}
