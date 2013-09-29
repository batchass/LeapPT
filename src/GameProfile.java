import java.util.ArrayList;

import processing.core.PApplet;


public class GameProfile {
	
	/// name, current level, high score, time spent playing, % completed, num wins, num losses ///// 
	boolean hasPlayed;
	String gameName;
	int highScore;
	int timeSpent;
	float percentComp;
	int numWins;
	int numLosses;
	int curLevel;
	
	GameProfile(boolean hp, String gn, int cl, int hs, int ts, float pc, int nw, int nl){
		
		hasPlayed = hp;
		
		gameName = gn;
		
		highScore = hs;
		 
		timeSpent = ts;
		
		percentComp = pc;
		
		numWins = nw;
		
		numLosses = nl;

		curLevel = cl;

	}

}/// end class
