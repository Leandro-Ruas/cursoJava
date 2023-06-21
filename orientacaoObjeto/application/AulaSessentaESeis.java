package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaSessentaESeisProduct;

public class AulaSessentaESeis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AulaSessentaESeisProduct product = new AulaSessentaESeisProduct();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Product " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdd = sc.nextInt();
		product.AddProducts(quantityAdd);
		
		System.out.println();
		
		System.out.println("Updated " + product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int quantityRemove = sc.nextInt();
		product.RemoveProducts(quantityRemove);
		
		System.out.println();
		
		System.out.println("Updated " + product);
			
		sc.close();
	}

}
