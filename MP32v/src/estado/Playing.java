package estado;

import MP3.Player;
import MP3.Song;

public class Playing implements EstadoMp3{
	
	public Playing() {
		
	}

		@Override
		public void play(Player _player, Song _song) {
			_player.exception();
		}
	
		@Override
		public void pause(Player _player, Song _song) {
			_player.modePause();
			_song.pause();
		}
	
		@Override
		public void stop(Player _player, Song _song) {
			// TODO Auto-generated method stub	
		}

}
