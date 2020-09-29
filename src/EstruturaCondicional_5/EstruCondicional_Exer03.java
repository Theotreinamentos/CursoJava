package EstruturaCondicional_5;
/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente. */

import java.util.Locale;
import java.util.Scanner;

public class EstruCondicional_Exer03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {

			System.out.println("S�o multiplos:");
		} else {
			System.out.println("N�o S�o multiplos:");
		}
		sc.close();

	}

}
