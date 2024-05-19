import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		
		double price;
		
		if (code == 1) {
			price = quantity * 4.0;
		}
		else if (code == 2) {
			price = quantity * 4.5;
		}
		else if (code == 3) {
			price = quantity * 5.0;
		}
		else if (code == 4) {
			price = quantity * 2.0;
		}
		else if (code == 5) {
			price = quantity * 1.5; 
		}
		else {
			System.out.println("Código inexistente!");
			price = 0.0;
		}
		
		System.out.printf("Total: R$ %.2f%n", price);
		
		sc.close();
	}
}
