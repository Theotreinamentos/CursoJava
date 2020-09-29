package EstruturaCondicional_5;
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
import java.util.Locale;
import java.util.Scanner;

public class EstruCondicional_Exer02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR:");
		} else {
			System.out.println("IMPAR:");
		}

		sc.close();

	}

}
