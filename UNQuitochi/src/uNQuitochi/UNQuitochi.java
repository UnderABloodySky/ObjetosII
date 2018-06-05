package uNQuitochi;

import alarm.AlarmClock;
import estados.*;
import screen.Screen;

public class UNQuitochi implements Tochi{
	
	private AlarmClock alarm;
	private Screen screen;
	private int minADormir;
	private int peso;
	private EstadoUnquitochi estado; 
	private int pesoMaximo;
	private int pesoMinimo;
	
		public UNQuitochi(AlarmClock _alarm, Screen _screen, int _minADormir){	
			//Si _minADormir <= 0 deberia de romper.
			alarm = _alarm;
			screen = _screen;
			minADormir = _minADormir;
			estado = new ConLaBocaAbierta();
			this.setPeso(2);
			pesoMinimo = 0;
			pesoMaximo = 5;
		}

			@Override
			public void alimentar() {
				estado.alimentar(this);
			}
		
			public void abrirLaBoca() {
				this.setEstado(new ConLaBocaAbierta());
			}
			
			private void morir() {
				this.setEstado(new Muerto());
			}
			
			@Override
			public void jugar() {
				this.ponerseLaGorraParaJugar();
			}
		
			public void ponerseLaGorraParaJugar() {
				this.setEstado(new ConLaGorra());
			}

			@Override
			public void dormir() {
				estado.dormir(this);
			}
		
			public void dormirse() {
				this.setEstado(new Dormido());
				this.PonerLaAlarma();
			}
			
			private void PonerLaAlarma() {
				alarm.despertarENn(minADormir, this);
			}

			@Override
			public void despertar() {
				estado.despertar(this);
			}
			
			public void despertarse() {
				this.setEstado(new ConLaBocaAbierta());
			}
		
			@Override
			public void accionar() {
				estado.accionar(this);
			}
		
			@Override
			public void ponerEnPantalla(String str) {
				this.screen.text(str);
			}
		
			@Override
			public int peso() {
				return peso;
			}
			
			private void setPeso(int _peso) {
				peso = _peso;
			}

			private void setEstado(EstadoUnquitochi _estado) {
				estado = _estado;
			}

			public void recibirPorcionDeAlimento() {
				this.fluctuarPesoEN(1);
			}
			
			private void fluctuarPesoEN(int n) {
				
			int nuevoPeso = this.peso() + n;
				
				if(nuevoPeso <= pesoMinimo || nuevoPeso >= pesoMaximo) {
					this.morir();
				}
				else{
					this.setPeso(nuevoPeso);
				}
			}

			public void buscarJuguete() {
				this.fluctuarPesoEN(-1);
			} 
}
