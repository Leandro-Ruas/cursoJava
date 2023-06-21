package application;

import java.util.Scanner;

public class AulaNoventaEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		
		int cont = 0;
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] % 2 ==0) {
				System.out.print(vect[i] + " ");
				cont++;
			}	
		}

		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);
		
		sc.close();
	}

}
