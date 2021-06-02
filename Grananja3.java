package domaci;

import java.util.Scanner;

public class MeseciGodina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite mesec u godini");
		String mesec;
		mesec = sc.nextLine();
		
		switch (mesec) {
		case "januar": 
		case "jun":
		case "jul":
			System.out.println("U toku godine ima tri meseca koji pocinju na slovo j");
			break;
		case "mart":
		case "maj":
		case "april":
		case "avgust":
			System.out.println("U toku godine ima dva meseca koji pocinju na ovo slovo");
			break;
		case "februar":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":
			System.out.println("U toku godine ima jedan mesec koji pocinje na ovo slovo");
			break;
			default:
				System.out.println("U toku godine nema meseca koji pocinje na ovo slovo");
		}
		

	}

}
