package Grundlagen;

import java.util.Scanner;

public class NinaNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println();
		 double note = scanner.nextDouble();
		 if (note >= 1.0 && note <= 1.4) {
			 
			 System.out.println("Ihre Note ist sehr gut!"); }
		 
		 else if (note >= 1.5 && note <= 2.4) {
			 
			 System.out.println("Ihre Note ist gut!"); }
		 
		 else if (note >= 2.5 && note <= 3.4) {
			 
			 System.out.println("Ihre Note ist befridigend!");}
		 
		 else if (note >= 3.5 && note <= 4.0) {
			 
			 System.out.println("Ihre Note ist Ausreichend!");}
		 
		 else if (note >= 4.1 && note <= 5.0) {
			 
			 System.out.println("Sie Haben NICHT bestanden");}
		 
		 else {
			 
			 System.out.println("ungültige Note Vielen Dank für ihre Teilnahme");
		 }
		 
		 
		 
		 
		 
	}

}
