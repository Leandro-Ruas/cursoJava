package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaNoventaEx3Pessoa;

public class AulaNoventaEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		AulaNoventaEx3Pessoa[] vect = new AulaNoventaEx3Pessoa[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome   = sc.nextLine();
			System.out.print("Idade: ");
			int idade     = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new AulaNoventaEx3Pessoa(nome, idade, altura);
		}
		
		double sum   = 0.0;
		double menor = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getAltura();
			if(vect[i].getIdade() < 16) {
				menor ++;
			}	
		}
		
		double media = sum / vect.length;
		double mediamenor = menor * 100.0 / vect.length;
		
		System.out.println();
		
		System.out.printf("Altura media: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", mediamenor);
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}	
		}
		
		
		
		sc.close();
	}

}
