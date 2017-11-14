package NTRUpak;

public aspect PrintAspect 
{
	pointcut PolynomialMultiply() : execution (* Polynomial.MultiplyPolynomial(..) );
	pointcut PolynomialPrint() : call ( void Polynomial.PrintPolynomial() );
	
	before () : PolynomialPrint() 
	{
		System.out.print("Polynomial: ");
	}
	
	before () : PolynomialMultiply() 
	{
		System.out.println("Calling multiply op...");
	}

	after() returning() : PolynomialMultiply() 
	{
		System.out.println("multiply op done! The Result is: ");
	}
	
}
