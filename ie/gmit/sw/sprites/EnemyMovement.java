package ie.gmit.sw.sprites;

public class EnemyMovement {
	
	private static int enemyTimer;
	private static int enemyDirectionTimer;
	
	public void startMove(Sprite enemy, int[][] matrix, int speed, int tiles) {
		enemyTimer++;
		
		if(enemyTimer == speed){
			enemy.move(null, matrix);
			enemyTimer = 0;
			enemyDirectionTimer++;
		}
		
		if(enemy.getDirection() == Direction.DOWN && enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.UP);
			enemyDirectionTimer = 0;
		}
		else if(enemy.getDirection() == Direction.UP && enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.DOWN);
			enemyDirectionTimer = 0;
		}
		else if(enemy.getDirection() == Direction.RIGHT && enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.LEFT);
			enemyDirectionTimer = 0;
		}
		else if(enemy.getDirection() == Direction.LEFT && enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.RIGHT);
			enemyDirectionTimer = 0;
		}
		
		
	}

}
