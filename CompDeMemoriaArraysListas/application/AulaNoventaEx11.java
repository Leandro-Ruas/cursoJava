package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaNoventaEx11Pessoa;

public class AulaNoventaEx11 {

	public static void main(String[] args) {
		
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
		 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
         * de homens. 
         * Diferente do exercicio proposto acima, irei criar uma classe para
		 * recener os dados do aluno, tambem utilizarei nessa ativadade o laco for each.
         */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		AulaNoventaEx11Pessoa[] vect = new AulaNoventaEx11Pessoa[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("Altura da %da a pessoa: ", i+1);
			double altura = sc.nextDouble();
			
			System.out.printf("Genero da %da a pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			
			vect[i] = new AulaNoventaEx11Pessoa(genero, altura);
		}
		
		double menorAltura = vect[0].getAltura(), maiorAltura = vect[0].getAltura(), sum = 0.0, media = 0.0;
		int nHomens = 0, nMulheres = 0; 
		
		for(AulaNoventaEx11Pessoa pessoa : vect) {
			
			if(pessoa.getAltura() > maiorAltura) {
				maiorAltura = pessoa.getAltura();
			} else if(pessoa.getAltura() < menorAltura) {
				menorAltura = pessoa.getAltura();
			}
			
			if(pessoa.getGenero() == 'F') {
				sum += pessoa.getAltura();
				nMulheres++;
			} else {
				nHomens++;
			}
		}
		
		media = sum / nMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + nHomens);
		
		sc.close();
	}

}
