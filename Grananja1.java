package domaci;

import java.util.Scanner;

public class ParniNeparni {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		
		double broj;
		broj = sc.nextDouble();
		
		if (broj % 2 == 0) {
			System.out.println("Broj je paran!");
		}
		
		else System.out.println("Broj je neparan!");
		

	}

}
