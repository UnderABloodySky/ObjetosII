package mercado;

public class Servicio extends Factura{
	
	private Float cantUnidadesConsumidas;
	
	public Servicio(AgenciaRecaudadora agencia, Float costoPorUnidad, Float _cantUnidadesConsumidas) {
		super(agencia, costoPorUnidad);
		cantUnidadesConsumidas = _cantUnidadesConsumidas;
	}

	private Float costoPorUnidadConsumida() {
		return this.valorDeterminado();
	}
	
	private Float cantidadDeUnidadesConsumidasEnElPeriodo() {
		return cantUnidadesConsumidas;
	}
	
	@Override
	public Float montoAPagar() {
		return this.costoPorUnidadConsumida() * this.cantidadDeUnidadesConsumidasEnElPeriodo();
	}

}
