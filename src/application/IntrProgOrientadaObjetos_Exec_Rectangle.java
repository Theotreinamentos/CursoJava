package application;

import java.util.Locale;
import java.util.Scanner;

import entities.IntrProgOrientadaObjetos_Rectangle;

public class IntrProgOrientadaObjetos_Exec_Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		IntrProgOrientadaObjetos_Rectangle rect = new IntrProgOrientadaObjetos_Rectangle();
		
		System.out.println("Enter rectangle width and  height: ");
		rect.witdth = sc.nextDouble();
		rect.height = sc.nextDouble();
			
		System.out.printf("AREA = %.2f%n", rect.area() );
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagnal());
		
		sc.close();

	}

}
