package estado;

import MP3.Player;
import MP3.Song;

public class Pause implements EstadoMp3{
	
	public Pause() {
		
	}

		@Override
		public void play(Player _player, Song _song) {
			_player.exception();
		}

		@Override
		public void pause(Player _player, Song _song) {
			_player.modePlaying();
			_song.play();
		}
	
		@Override
		public void stop(Player _player, Song _song) {
			
			_song.stop();
		}
	
}
