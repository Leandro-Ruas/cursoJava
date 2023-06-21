package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaSessentaENoveEx1Rectangle;

public class AulaSessentaENoveEx1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AulaSessentaENoveEx1Rectangle rectangle = new AulaSessentaENoveEx1Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width  = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
