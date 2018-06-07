package mercado;

public class Impuesto extends Factura{

	public Impuesto(AgenciaRecaudadora _agencia, Float _tasa) {
		super(_agencia, _tasa);
	}

	private Float tasa() {
		return this.valorDeterminado();
	}
	
	@Override
	public Float montoAPagar() {
		return this.tasa();
	}
}

