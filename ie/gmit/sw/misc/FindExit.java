package ie.gmit.sw.misc;

public class FindExit {
	
	public static int[] main(int[][] things) {
		int local[] = new int[2];
		
		for(int i = 0; i < things.length; i++) {
	        for(int j = 0; j < things[i].length; j++) {
	            if(things[i][j] == 9){
	            	local[0] = j;
	            	local[1] = i;
	            }
	        }
	    }
		
		return local;
	}

}
