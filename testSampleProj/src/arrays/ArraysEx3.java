package arrays;

public class ArraysEx3 {

	public static void main(String[] args) {

		int a[][] = new int[2][2];

		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;

		for (int i = 0; i < 2; i++) // rows
		{
			for (int j = 0; j < 2; j++) // columns
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
