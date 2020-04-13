import java.util.Locale;
import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int numpec1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int numpec2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = numpec1 * valor1 + numpec2 * valor2;
	
		System.out.printf("Valor a Pagar = R$%.2f%n", total);
		
		sc.close();

	}

}
