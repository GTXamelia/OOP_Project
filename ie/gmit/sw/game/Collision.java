package ie.gmit.sw.game;

import javax.swing.JLabel;

import ie.gmit.sw.sprites.Sprite;

public class Collision {

	public static void playerCollision(Sprite[] enemies, Sprite player, JLabel infoLabel, int[] local) {

		for (int i = 0; i < enemies.length; i++) {

			if (enemies[i].getPosition().getX() == player.getPosition().getX() && enemies[i].getPosition().getY() == player.getPosition().getY()) {
				player.setPosition(0, 0);
				infoLabel.setText("Caught by " + enemies[i].getName());
			}

		}
		
		for(int i = 0; i < local.length; i++) {
            if(player.getPosition().getX() == local[0] && player.getPosition().getY() == local[1]){
            	infoLabel.setText("Done");
            }
	    }
		
	}
}
