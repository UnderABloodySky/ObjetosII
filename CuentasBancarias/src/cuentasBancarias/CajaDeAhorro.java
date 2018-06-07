package cuentasBancarias;

public class CajaDeAhorro extends CuentaBancaria {
private int limite;
	
	public CajaDeAhorro(String titular, int _limite){
		super(titular);
		this.setLimite(_limite);
	}
	
		public int getLimite(){
			return this.limite;
		}
	
		public void setLimite(int _limite) {
			limite = _limite;
		}

		@Override
		protected boolean cumpleCondicion(int _monto) {
			return this.hayMasDe(_monto) && this.getLimite()>= _monto;
		}
}
