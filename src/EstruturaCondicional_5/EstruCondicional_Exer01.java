package EstruturaCondicional_5;
//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
import java.util.Locale;
import java.util.Scanner;

public class EstruCondicional_Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		
		numero = sc.nextInt();
		if(numero > 0) {
			System.out.println("POSITIVO:");
		}else {
			System.out.println("NEGATIVO:");
		}
		
		
		sc.close();

	}

}
