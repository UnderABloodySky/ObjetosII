package mercado;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import precios.Precio;
import precios.PrecioEmpresarial;

public class CajaTest{

	private Cliente clientePrueba;
	private Mercado mercadoCentral;
	private Caja cajaPrueba;
	
	private Producto arroz; 
	private Producto yerba;
	private Producto manzana;
	private Producto manteca;
	private Producto pan;
	private Producto mermelada;
	
	private Precio precioArroz;
	private Precio precioYerba;
	private Precio precioManzana;
	private Precio precioManteca;
	private Precio precioPan;
	private Precio precioMermelada;
	
		@Before
		public void setUp() {
			clientePrueba = new Cliente();
			mercadoCentral = new Mercado();
			
			precioArroz = new PrecioEmpresarial(new Float(20));
			precioYerba = new PrecioEmpresarial(new Float(80));
			precioManzana = new PrecioEmpresarial(new Float(2));
			precioManteca = new PrecioEmpresarial(new Float(30));
			precioPan = new PrecioEmpresarial(new Float(40));
			precioMermelada = new PrecioEmpresarial(new Float(30));
			
	
			arroz = new Producto(clientePrueba, "Arroz", precioArroz);
			yerba = new Producto(clientePrueba, "Yerba", precioYerba);
			manzana = new Producto(clientePrueba, "Manzana", precioManzana);
			manteca = new Producto(clientePrueba, "Manteca", precioManteca);
			pan = new Producto(clientePrueba, "Pan", precioPan);
			mermelada = new Producto(clientePrueba, "Mermelada", precioMermelada);
									
			mercadoCentral.agregarProducto(arroz, 0);
			mercadoCentral.agregarProducto(yerba, 0);
			mercadoCentral.agregarProducto(manzana, 0);
			mercadoCentral.agregarProducto(manteca, 0);
			mercadoCentral.agregarProducto(pan, 0);
			mercadoCentral.agregarProducto(mermelada, 0);
						
			clientePrueba.comprar(arroz);
			clientePrueba.comprar(yerba);
			clientePrueba.comprar(manzana);
			clientePrueba.comprar(manteca);
			clientePrueba.comprar(pan);
			clientePrueba.comprar(mermelada);
			
			cajaPrueba = new Caja(mercadoCentral);
		}
	
		@Test
		public void test() {
			cajaPrueba.registrarCobro(clientePrueba);
			assertEquals( new Float(202), clientePrueba.getTotal());
		}
}