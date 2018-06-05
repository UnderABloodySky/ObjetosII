package alarm;

import uNQuitochi.UNQuitochi;

public class AlarmClock {

	public void despertarENn(int minADormir, UNQuitochi unQuitochi) {
		
		int seg = minADormir * 60; 
		while(seg > 0) {
			seg -= 1;
		}
		unQuitochi.despertar();
	}

}
