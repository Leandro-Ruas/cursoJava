package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaSessentaENoveEx2Employee;

public class AulaSessentaENoveEx2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AulaSessentaENoveEx2Employee employee = new AulaSessentaENoveEx2Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax =  sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
