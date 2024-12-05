package arrays;

public class ArraysEx4 {

	public static void main(String[] args) {

		int a[][][] = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };

		for (int i = 0; i < a.length; i++) //  1 dim 
		{
			for (int j = 0; j < a[i].length; j++) // 2 dim 
			{
				for (int k = 0; k < a[i][j].length; k++) { // 3 dim
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println("");
			}
			
		}
	}
}
