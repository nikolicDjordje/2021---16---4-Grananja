package domaci;

public class DodatniZadatak {

	public static void main(String[] args) {
		
		/*Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. 
		Vodite racuna o prestupnoj godini!) */
		
		int godina = 2014;
		String mesec = "februar";
		
		switch(mesec) {
		case "januar":
		case "mart":
		case "maj":
		case "jul":
		case "avgust":
		case "oktobar":
		case "decembar":
			System.out.println("Uneti mesec ima 31 dan.");
			break;
		case "april":
		case "jun":
		case "septembar":
		case "novembar":
			System.out.println("Uneti mesec ima 30 dana.");
			break;
		case "februar": if (godina % 4 == 0)  {
			System.out.println("Mesec ima 29 dana.");
		}
		else  	System.out.println("Mesec ima 28 dana");
	
			
			
		}
		
		
		
	}

}







