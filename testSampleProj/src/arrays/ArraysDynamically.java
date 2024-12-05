package arrays;

public class ArraysDynamically {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 3, 4 }, { 5 }, { 7, 8, 9, 10 } };
		/*
		 * for (int i = 0; i < a.length; i++) // 1 { for (int j = 0; j < a[i].length;
		 * j++) // 2 { System.out.print(a[i][j] + " "); } System.out.println();
		 * 
		 * }
		 */
		
		int b[][][] = {{{2,3,5,6,7},{4,5},{5,6,10,23}}};
		for (int i = 0; i <b.length; i++) // 1
		{
			for (int j = 0; j < b[i].length; j++) // 2
			{
				for (int k = 0; k < b[i][j].length; k++) // 2
				{
				System.out.print(b[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

}
