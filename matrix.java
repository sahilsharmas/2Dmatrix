
class matrix{
	public static void printMatrix(int matrix[][]){
		for (int [] row : matrix)
		{
			
			for (int element : row)
			{
				
				System.out.print( element  + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] matrix = {  { 3, 2 },
					  { 9, 11 }};
		printMatrix(matrix);
	}
}