import java.util.Locale;
import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor01 = sc.nextInt();
		int valor02 = sc.nextInt();

		int soma = valor01 + valor02;

		System.out.println("SOMA = " + soma);

		sc.close();
	}

}
