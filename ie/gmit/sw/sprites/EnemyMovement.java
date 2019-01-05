package ie.gmit.sw.sprites;

public class EnemyMovement {
	
	private int enemyTimer = 0;
	private int enemyDirectionTimer = 1;

	public void startMove(Sprite enemy, int[][] matrix, int speed, int tiles) {
		this.enemyTimer++;
		
		if(enemyTimer == speed){
			enemy.move(null, matrix);
			this.enemyTimer = 0;
			this.enemyDirectionTimer++;
		}
		
		if(enemy.getDirection() == Direction.DOWN && this.enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.UP);
			this.enemyDirectionTimer = 1;
		}
		else if(enemy.getDirection() == Direction.UP && this.enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.DOWN);
			this.enemyDirectionTimer = 1;
		}
		else if(enemy.getDirection() == Direction.RIGHT && this.enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.LEFT);
			this.enemyDirectionTimer = 1;
		}
		else if(enemy.getDirection() == Direction.LEFT && this.enemyDirectionTimer == tiles){
			enemy.setDirection(Direction.RIGHT);
			this.enemyDirectionTimer = 1;
		}
		
	}
	
}
