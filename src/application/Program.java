package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retang = new Rectangle();
		System.out.println("Insira os valores altura e comprimento:");
		retang.width= sc.nextDouble();
		retang.height = sc.nextDouble();
		
		System.out.printf("A área do retangulo é de: %.2f%n", retang.area());
		System.out.printf("A medida do perímetro é de: %.2f%n", retang.perimetro());
		System.out.printf("A diagonal do retangulo segundo Pitagoras: %.2f%n", retang.pitagoras());
		sc.close();	
	}

}
