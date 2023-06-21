package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaNoventaEx10Aluno;

public class AulaNoventaEx10 {

	public static void main(String[] args) {

		/**
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis). 
		 * Diferente do exercicio proposto acima, irei criar uma classe para
		 * recener os dados do aluno, tambem utilizarei nessa ativadade o laco for each.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		AulaNoventaEx10Aluno[] vect = new AulaNoventaEx10Aluno[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %da o aluno: \n", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			vect[i] = new AulaNoventaEx10Aluno(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(AulaNoventaEx10Aluno aluno : vect) {
			if(aluno.media() >= 6.0) {
				System.out.println(aluno.getNome());
			}
		}
		
		sc.close();
	}

}
