package application;

import java.util.Scanner;

import entities.AulaNoventaETresPousada;

public class AulaNoventaETres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many will be rented? ");
		int n = sc.nextInt();
		
		AulaNoventaETresPousada[] vect = new AulaNoventaETresPousada[10];
		
		int room = 0;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			vect[room] = new AulaNoventaETresPousada(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(AulaNoventaETresPousada hospedes : vect) {
			if(hospedes != null) {
				System.out.println(room + ": " + hospedes);
			}
		}
		
		sc.close();
	}

}
