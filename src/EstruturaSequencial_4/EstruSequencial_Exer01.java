package EstruturaSequencial_4;
import java.util.Locale;
import java.util.Scanner;

public class EstruSequencial_Exer01 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);		
	Scanner sc = new Scanner (System.in);
	
	int A, B, soma;
	
	A = sc.nextInt();
	B = sc.nextInt();
	//comando de atribuição
	soma = A + B;

	
	System.out.println("SOMA = " + soma);
	
	sc.close();
	
	}
   

}
