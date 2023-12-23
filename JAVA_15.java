import java.util.Scanner;

class JAVA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = 4; /* scanner.nextInt(); */
		 System.out.println("\t\t\tJAVA_PATTERN\n\n");
		int col = 7; /* scanner.nextInt(); */
		for (int i = 0; i < row; i++) {
			
			// Print J
			for (int j = 0; j < col; j++)
				if ((j > col - 3 && i == 0) || (j == col - 1 && i == row - 2)|| ( i == row - 2 && j < 1)
						|| ( i == row -1 && j >0 && j < col - 1 ) || ( i == row - 3 && j == col - 1))
					System.out.print("J ");
				else
					System.out.print("  ");
			for (int space = 0; space < 1; space++)
				System.out.print(" ");
			
			// Print A
			for (int j = 0; j < col; j++)
				if( j == (col / 2) - i || j == (col / 2) + i)
					System.out.print("A ");
				else if( i == (row/2) &&  j > (col / 2) - i && j < (col/2) + i)
					System.out.print("A ");
				else
					System.out.print("  ");
			
			for (int space = 0; space < 1; space++)
				System.out.print(" ");
			
			
			// Print V
			for (int j = 0; j < col; j++)
				if( i == j || j == ( col - i - 1))
					System.out.print("V ");
				else
					System.out.print("  ");
			
			
			for (int space = 0; space < 1; space++)
				System.out.print(" ");
			
			
			for (int j = 0; j < col; j++)
				if( j == (col / 2) - i || j == (col / 2) + i)
					System.out.print("A ");
				else if( i == (row/2) &&  j > (col / 2) - i && j < (col/2) + i)
					System.out.print("A ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}