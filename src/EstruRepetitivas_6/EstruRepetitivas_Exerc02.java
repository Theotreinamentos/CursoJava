package EstruRepetitivas_6;

import java.util.Locale;
import java.util.Scanner;

public class EstruRepetitivas_Exerc02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x; // operador de operação cumulativa [ soma += x ]
			x = sc.nextInt();
		}
		System.out.println("A soma foi = " + soma );
		
		sc.close();

	}

}
