package OutrosTopicosBasicosSobreJava_7;
/*
 * Este programa calcula as ra�zes de uma equa��o do segundo grau Os valores dos
 * coeficientes devem ser digitados um por linha
 */
import java.util.Locale;
import java.util.Scanner;

public class OutrTopBasicSobreJava_Exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c; // c�lculo do valor de delta
		System.out.println(delta);

	}

}
