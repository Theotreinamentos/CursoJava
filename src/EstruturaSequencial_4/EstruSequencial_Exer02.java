package EstruturaSequencial_4;
import java.util.Locale;
import java.util.Scanner;

public class EstruSequencial_Exer02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double R,A, pi = 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("AREA =%.4f%n", A);
		
		
		sc.close();
		
		
	}

}
