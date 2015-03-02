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

	static RunGame rg;
	
	public FrontEndInterface (RunGame r){
		rg = r;
	}
	
	public static void settyClicked (){
		rg.setActionType(1);
	}
	
	public static void cityClicked (){
		rg.setActionType(2);
	}
	
	public static void vertexClicked (int v){
		rg.setVertex(v);
	}
	
}
