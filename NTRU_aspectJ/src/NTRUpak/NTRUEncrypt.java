package NTRUpak;

public class NTRUEncrypt {
	
	public Integer N = 2;
	private Integer p;
	private Integer q;
	
	private Polynomial f;
	private Polynomial g;
	private Polynomial fp;
	private Polynomial fq;
	private Polynomial h;
	private Polynomial e;
	
	private static NTRUEncrypt instance = null;
	
	public Bmessage message;
	
	private NTRUEncrypt () 
	{
		String m = "1"; //dat ca param prin constructor; introdus aici doar ptr a compila programul fara erori;
		message = new MessageProxy(m);
	}
	
	public static NTRUEncrypt getInstance() 
	{
	      if(instance == null) 
	      {
	         instance = new NTRUEncrypt();
	      }
	      return instance;
	}
	
	public void TEST2 ()
	{
		System.out.println(N);
	}
	
	public void TEST ()
	{
		System.out.println("NTRUEncrypt done!");
		N = 3;
		System.out.println(N);
	}
	
	public String Encrypt ()
	{
		return null;
	}
	
	public String GenerateKeys ()
	{
		return null;
	}
}
