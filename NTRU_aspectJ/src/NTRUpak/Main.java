package NTRUpak;

public class Main {

	public static void main(String[] args) 
	{
		
		//NTRUEncrypt A = new NTRUEncrypt();
		//NTRUDecrypt B = new NTRUDecrypt();
		
		//NTRUEncrypt A = NTRUEncrypt.getInstance();
		//A.TEST();
		//NTRUEncrypt B = NTRUEncrypt.getInstance();
		//B.TEST2();
		
		Polynomial a;
		a = new Polynomial (5);
		
		Polynomial b;
		b = new Polynomial ();
				
		a.GenerateRandomPolynomial(2);
		b.GenerateRandomPolynomial(3);
		a.PrintPolynomial();
		b.PrintPolynomial();
		
		System.out.println();
		
		a.MultiplyPolynomial(b);
		a.PrintPolynomial();
		
		System.out.println();
		System.out.println();
		
		a.GenerateRandomTernaryPolynomial(2);
		b.GenerateRandomTernaryPolynomial(3);
		a.PrintPolynomial();
		b.PrintPolynomial();
		
		System.out.println();
		
		a.MultiplyPolynomial(b);
		a.PrintPolynomial();
	}

}
