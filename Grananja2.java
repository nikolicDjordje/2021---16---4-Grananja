package domaci;

import java.util.Scanner;

public class PrethodniDomaci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvu stranicu prostorije");
		double a;
		a = sc.nextDouble();
		
		System.out.println("Unesite drugu stranicu prostorije");
		
		double b;
		b = sc.nextDouble();
		
		System.out.println("Unesite trecu stranicu prostorije");
		double c;
		c = sc.nextDouble();
		
		double povrsina;
		povrsina = 2 * ((a * b) + (a * c) + (b * c));
		double okreceno = povrsina - a * b;
	
		
		if (a > 0 && b > 0 && c > 0) {
			System.out.println("Povrsina celokupne prostorije iznosi" + povrsina);
			System.out.println("Povrsina okrecene prostorije iznosi" + okreceno);
		}
		else if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Netacan iznos");
			
		}

	}

}
