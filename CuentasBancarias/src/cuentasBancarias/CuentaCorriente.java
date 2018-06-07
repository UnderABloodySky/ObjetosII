package cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
	private int descubierto;

		public CuentaCorriente(String titular, int _descubierto){
			super(titular);
			this.setDescubierto(_descubierto);
		}
		
			public void setDescubierto(int _descubierto) {
				descubierto = _descubierto;
			}
		
			public int getDescubierto(){
				return this.descubierto;
			}
		
			@Override
			protected boolean cumpleCondicion(int _monto) {
				return this.getSaldo() + this.getDescubierto() <= _monto;
			}
}