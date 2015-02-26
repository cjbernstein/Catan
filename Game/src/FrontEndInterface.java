/*
 * This is the class that we will use to communicate with the GUI and interpret requests from players
 * 
 * Game flow will be
 * 1. User makes an action
 * 2. FrontEndInterface gets request
 * 3. FEI sends request to GamePlayer
 * 4. GamePlayer gives result to FEI, which will call redraw on GUI
 */
public class FrontEndInterface {

	GamePlayer gp;
	
	public FrontEndInterface (GamePlayer player){
		gp= player;
	}
	
	
	
	
}
