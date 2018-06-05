package cliente;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import banco.Banco;

public class TestCliente {
	
	private Cliente clientePrueba;
	private Banco santanderRio;
		
		@Before
		public void setUp() {
			santanderRio = new Banco();
			clientePrueba = new Cliente ("Juan", "Perez", "CalleFalsa 1234", 48, (float) 20000);
		}
	
		@Test
		public void testNombre() {
			assertEquals("Juan", clientePrueba.getNombre());
		}
		
		@Test
		public void testApellido() {
			assertEquals("Perez", clientePrueba.getApellido());
		}
		
		@Test
		public void testDireccion() {
			assertEquals("CalleFalsa 1234", clientePrueba.getDireccion());
		}
		
		@Test
		public void testEdad() {
			
			Integer edadPrecalculada = new Integer(48);
			
			assertEquals(edadPrecalculada, clientePrueba.getEdad());
		}
		
		@Test
		public void testSueldoMensual() {
			
			Float sueldoMensualPrecalculado = new Float(20000);
			
			assertEquals(sueldoMensualPrecalculado, clientePrueba.getSueldoNetoMensual());
		}
		
		@Test 
		public void testSeApruebaSolicitudDeCreditoPersonal() {
			
		}

}
