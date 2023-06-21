package application;

import java.util.Scanner;

public class AulaNoventaEx9 {

	public static void main(String[] args) {
		
		/**
		 * Criando codigo conforme enunciado:
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
		 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
		 * da pessoa mais velha. 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] =  sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		String maisVelho = "";
		int maiorIdade = 0;
		
		for(int i=0; i<n; i++) {
			if(idade[i] > maiorIdade) {
				maisVelho = nome[i];
				maiorIdade = idade[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();
	}

}
