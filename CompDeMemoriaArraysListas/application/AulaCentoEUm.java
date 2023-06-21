package application;

import java.util.Scanner;

public class AulaCentoEUm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		Integer[][] mat = new Integer[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = sc.nextInt();

			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (x == mat[i][j]) {

					System.out.println("Position " + i + "," + j + ":");
					
					if (j > 0) {

						System.out.println("Left: " + mat[i] [j - 1 ]);
						
					} 
					

					if(i > 0) {
						System.out.println("up: " + mat[i - 1][j]);
					}
					
					if (j < mat[i].length) {

						System.out.println("right: " + mat[i][j + 1]);
						System.out.println(mat[i].length-1);
						
					} 
					
					if(i < mat.length) {
						System.out.println("down: " + mat[i + 1][j]);
					}
					
					
				}

			}
		}

		sc.close();

	}

}
