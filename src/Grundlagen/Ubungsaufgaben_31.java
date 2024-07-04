package Grundlagen;

import java.util.Scanner;

public class Ubungsaufgaben_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Verwenden Sie die Switch-Kontrollstruktur In einer ausführbaren Klasse soll innerhalb
		//der main()-Methode vom Verwender eine Zahl zwischen 0 und 9 eingelesen werden.
		//• Wenn 0 oder 1 oder 2 oder 3 eingegeben wird, dann geben Sie aus "Bereich Null
		//bis Drei".
		//• Wenn 4 oder 5 oder 6 oder 7 eingegeben wird, dann geben Sie aus "Bereich Vier
		//bis Sieben".
		//• Wenn 8 oder 9 eingegeben wird, dann geben Sie aus "Bereich Acht bis Neun".
		//• Durch den default-Zweig sollen alle anderen Zahleneingaben ̸= [0 .... 9] behandelt werden.


		




	 Scanner scanner = new Scanner (System.in);
	 int number;
	 
	 System.out.println("Geben Sier eine Zahl zwisxhen 0 und 9 ein; ");
	 number = scanner.nextInt ();
	 
	 switch ( number) {
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
		
	}

