import java.util.Locale;
import java.util.Scanner;

public class EstrCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas Horas ?");
		double hora = sc.nextDouble();
		
		if (hora < 12 ) {
			System.out.println("Bom DIAAAAA");
		}
		else if (hora < 18 ) {
			System.out.println("BOA TARDE");
			}
		else if (hora == 21 ) {
			System.out.println("NOVE HORASV=== HUUUU");
		}
		else {
			System.out.println("BOA NOITE");
			}
		
		
		sc.close();
	}

}