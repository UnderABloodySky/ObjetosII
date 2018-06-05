package estado;

import MP3.Song;
import MP3.Player;

public interface EstadoMp3 {
	
	public void play(Player _player, Song _song);
	
	public void pause(Player _player, Song _song);

	public void stop(Player _player, Song _song);
}
