package application;

import java.util.Locale;
import java.util.Scanner;

public class AulaNoventaEx2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		System.out.println();
		System.out.printf("VALORES = ");
		
		for(int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i]);
			sum += vect[i];
		}
		
		double media = sum / vect.length;
		
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
