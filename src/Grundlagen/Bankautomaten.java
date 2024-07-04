package Grundlagen;

import java.util.Scanner;

public class Bankautomaten {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double guthaben = 346.14;
	
			System.out.println("Ihr Guthaben beläuft sich auf " + guthaben + "Euro");
		System.out.println("Wieviel möchten Sie abheben?");
		
		Scanner scanner = new Scanner(System.in);
		double abhebungsbetrag = scanner.nextDouble();
		
		if(abhebungsbetrag <= guthaben) {
			
			System.out.println("Es werden" + abhebungsbetrag + "Euro ausgezahlt");
			guthaben = guthaben - abhebungsbetrag;
			System.out.println("Ihr konto beträgt" + guthaben + "Euro");
		} else {
			System.out.println("keinen Auszahlung möglich! Der angegebene Betrag übersteigt irh Guthaben");
		}
		
		scanner.close();
	}

}
