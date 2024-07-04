package Grundlagen;

public class WhatsyoureNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    int number = (int) (Math.random() * 5 + 1);



		    System.out.println( "Welche Zahl denke ich mir zwischen 1 und 3?" );

		    int guess = new java.util.Scanner( System.in ).nextInt();



		    if ( number == guess ) {

		      System.out.println( "Super getippt!" );

		    }



		    System.out.println( "Starte das Programm noch einmal und rate erneut!" );
	}

}
