package Arrays;

public class ArraysTest {
	    public static void main(String[] args) {
	        // Testing single-dimensional array
	        int[] singleArray = new int[5];
	        for (int i = 0; i < singleArray.length; i++) {
	            singleArray[i] = i + 1;
	        }
	        System.out.println("Single-dimensional array: " + java.util.Arrays.toString(singleArray));

	        // Testing multi-dimensional array
	        int[][] multiArray = new int[5][5];
	        for (int i = 0; i < multiArray.length; i++) {
	            for (int j = 0; j < multiArray[i].length; j++) {
	                multiArray[i][j] = i + j;
	            }
	        }
	        System.out.println("Multi-dimensional array: ");
	        for (int[] row : multiArray) {
	            System.out.println(java.util.Arrays.toString(row));
	        }
	    }
}
