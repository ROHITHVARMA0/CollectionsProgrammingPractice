package testPractice.BasicProgramming;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input rows and columns
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

		// Input matrix
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// Spiral traversal
		int top = 0, bottom = rows - 1;
		int left = 0, right = cols - 1;

		System.out.println("Spiral Order:");
		while (top <= bottom && left <= right) {

			// Left to Right
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			
			top++;
			

			// Top to Bottom
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			
			right--;
			

			// Right to Left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				
				bottom--;
			}

			// Bottom to Top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				
				left++;
			}
		}

		sc.close();
	}
}