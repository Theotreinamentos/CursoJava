package EstruturaCondicional_5;

import java.util.Scanner;

public class EstruCondicional_Exer12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}else {
			discount = 0;
		}

		System.out.println(discount);
		sc.close();
	}

}
