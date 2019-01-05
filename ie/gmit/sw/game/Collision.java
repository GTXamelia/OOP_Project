package ie.gmit.sw.game;

import javax.swing.JLabel;

import ie.gmit.sw.sprites.Sprite;

public class Collision {

	public static void playerCollision(Sprite[] enemies, Sprite player, JLabel infoLabel) {

		for (int i = 0; i < enemies.length; i++) {

			if (enemies[i].getPosition().getX() == player.getPosition().getX() && enemies[i].getPosition().getY() == player.getPosition().getY()) {
				player.setPosition(0, 0);
				infoLabel.setText("Caught by " + enemies[i].getName());
			}

		}
		
		if (player.getPosition().getX() == 9 && player.getPosition().getY() == 2) {
			System.out.println("Test");
		}
	}

}
