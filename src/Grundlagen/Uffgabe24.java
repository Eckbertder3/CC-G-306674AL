package Grundlagen;

public class Uffgabe24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = 10;
		byte b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
	//A  Antwort Integer
		
		System.out.println(b1 + b2);
		
	//B Antwort Integer
		
		System.out.println(p + b1);
		
	//C Antwort Integer
		
		System.out.println(b1 * b2);
		
	//D Antwort  long
		
		System.out.println(q + p * (b1 + b2));
				
		
	//E Antwort float
		
		System.out.println(x + q * n);
		
	//F Antwort  float
		
		System.out.println(b1 * q/x);
		
	//G Antwort  double
		
		System.out.println(b1 * q * 2./x);
		
	//H Antwort float
		
		System.out.println(b1 * q *2.f/x);
		
	}

}
