package cuentasBancarias;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;

		public CuentaBancaria(String _titular){
			titular= _titular;
			this.setSaldo(0);
			movimientos=new ArrayList<String>();
		}
	
			public String getTitular(){
				return this.titular;
			}
			
			public int getSaldo(){
				return this.saldo;
			}
			
			protected void setSaldo(int monto){
				saldo=monto;
			}
		
			protected void agregarMovimientos(String movimiento){
				this.movimientos.add(movimiento);
			}
		
			public void extraer(int monto) {
				if(this.cumpleCondicion(monto)) {
					this.setSaldo(this.getSaldo()-monto);
					this.agregarMovimientos("Extraccion de: " + monto);
				}
			}
			
			public boolean hayMasDe(int _n) {
				return _n <= this.getSaldo(); 
			}
	
			protected abstract boolean cumpleCondicion(int _monto); 
}