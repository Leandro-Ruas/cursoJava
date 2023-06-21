package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AulaNoventaENoveEmpregado;

public class AulaNoventaENove {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		
		List<AulaNoventaENoveEmpregado> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			System.out.println();
			System.out.printf("Empregado nº %d:%n", i+1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(temID(list, id)) {
				System.out.print("Id existente, Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new AulaNoventaENoveEmpregado(id, nome, salario));
		} 
		
		System.out.println();
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		
		AulaNoventaENoveEmpregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(empregado != null) {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			empregado.aumentoSalarial(porcentagem);
		} else {
			System.out.println("Este id não existe!");
		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");

		for(AulaNoventaENoveEmpregado funcionarios : list) {
			System.out.println(funcionarios);
		}
		
		
		
		sc.close();
	}
	
	public static boolean temID(List<AulaNoventaENoveEmpregado> list, int id) {
		AulaNoventaENoveEmpregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empregado != null;
	}

}
