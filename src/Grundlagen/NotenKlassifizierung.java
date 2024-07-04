package Grundlagen;

import java.util.Scanner;

public class NotenKlassifizierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println();
		 double note = scanner.nectInt();
		 
		 System.out.println("Geben Sier eine Zahl zwisxhen 0 und 9 ein; ");
		 number = scanner.nextInt ();
		 
		 switch (input) {
		 case 0,1,2,3;
		 System.out.println("Bereich Null bis Drei");
		 case 4,5,6,7;
		 break;
		 System.out.println("Bereich Vier bis Sieben");
		 break;
		 case 8,9;
		 break;
		 System.out.println("Bereich Acht bis Neun");
		 break;
		 default:
			 System.out.println("Ungültige Eingabe");
		 }
		 scanner.close();
	}

}
