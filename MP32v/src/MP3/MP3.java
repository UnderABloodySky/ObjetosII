package MP3;

import java.util.List;

import estado.*;

import java.util.ArrayList;

public class MP3 implements Player{
	
	private List<Song> playList;
	private EstadoMp3 estado;
	
		public MP3() {
			playList = new ArrayList<Song>();
			estado = new Selection();
		}
		
			public void addSong(Song _song) {
				playList.add(_song);
			}
			
			public void removeSong(Song _song) {
				playList.remove(_song);
			}
			
			public List<Song> playList() {
				return playList;
			}
		
			@Override
			public void play(Song _song){
				estado.play(this, _song);
			}
			
			@Override
			public void pause( Song _song) {
				estado.pause(this,_song);
			}
			
			@Override
			public void stop(Song _song) {
				estado.stop(this,_song);
			}
			
			private void setEstado(EstadoMp3 _estado) {
				estado = _estado;
			}

			@Override
			public void modePlaying() {
				this.setEstado(new Playing());
			}

			@Override
			public void modePause() {
				this.setEstado(new Pause());
			}

			@Override
			public void modeSelection() {
				this.setEstado(new Selection());
			}
			
			
			public Exception exception() {
				return new Exception("La cancion no puede ser reproducida en este momento");
			}
			
}
