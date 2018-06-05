package MP3;

public interface Player {
	
	public void play(Song _song);
	
	public void pause(Song _song);
	
	public void stop(Song _song);

	public void modePlaying();
	
	public void modePause();
	
	public void modeSelection();

	public Exception exception();
}
