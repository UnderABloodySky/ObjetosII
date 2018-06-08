package articulos;

import java.util.ArrayList;
import java.util.List;

public class ArticuloCientifico implements Articulo{
	
	private String nombre;
	private List<String> autores;
	private String filiacion;
	private String tipoDeArticulo;
	private String lugar;
	List<String> palabrasClaves;
	
		public ArticuloCientifico(String _nombre, String autor, String _filiacion, String _tipo, String _lugar, List<String> _palabras){
			nombre = _nombre;
			autores = new ArrayList<String>(1);
			autores.add(autor);
			filiacion = _filiacion;
			tipoDeArticulo = _tipo;
			lugar = _lugar;
			palabrasClaves = _palabras;
		}	

		public ArticuloCientifico(String _nombre, List<String> _autores, String _filiacion, String _tipo, String _lugar, List<String> _palabras){
			nombre = _nombre;
			autores = _autores;
			filiacion = _filiacion;
			tipoDeArticulo = _tipo;
			lugar = _lugar;
			palabrasClaves = _palabras;
		}

		@Override
		public boolean trataSobre(String interes) {
			return palabrasClaves.contains(interes);
		}			
}
