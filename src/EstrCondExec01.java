import java.util.Locale;
import java.util.Scanner;

public class EstrCondExec01 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com numero =");
			int numero = sc.nextInt();
			
			if (numero < 0 ) {
				System.out.println("NEGATIVO");
			}
			else {
				System.out.println("NÃO NEGATIVO");
			}
			
			
			sc.close();
	}

}
