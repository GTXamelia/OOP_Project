package ie.gmit.sw.runner;

import ie.gmit.sw.menu.MainMenu;

public class Runner {
	public static void main(String[] args) throws Exception {
		//Can read in necessary information here and process it before going any further...
		
		//Never run a GUI in the same thread as the main method... This is asynchronous:
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() { //Template method....
				try {
					/* 
					 * ----------------------------------------
					 *             Control Keys
					 * ----------------------------------------
					 * Use the arrow keys to move the player.
					 * Move Player: 'X'
					 * Toggle View: 'Z'		
					 * ----------------------------------------
					 */
						MainMenu.main(args);
				} catch (Exception e) {
					e.printStackTrace(); //Real lazy stuff here...
				}
			}
		});
	}
}