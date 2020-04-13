import java.util.Locale;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salario = valorHora * horas;

		System.out.println("Numero= " + numero);
		System.out.printf("Salario = U$ %.2f%n", salario);

		sc.close();
	}

}
