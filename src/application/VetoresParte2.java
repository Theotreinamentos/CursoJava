package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VectParte2;

public class VetoresParte2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		VectParte2[] vect = new VectParte2[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new VectParte2(name, price);
				}
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVAREGE PRICE = %.2f%n", avg);
		sc.close();

	}

}
