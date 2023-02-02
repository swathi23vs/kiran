class Corona
{
	void virus ( )
	{
		System.out.println("it kills");
	}
}
class  mask extends Corona 
{
	void virus ( )
	{
		System.out.println("wear mask");
	}
}
class sanitizer extends Corona
{
	void virus ( )
	{
		System.out.println("social distance ");
	}
}
class hospital
{
	static void bed (Corona c3 )
	{
		c3.virus ( );
	}
}

public class poly3 {
	public static void main(String[]args)
	{
	
	mask m1=new mask( );
	sanitizer  h4=new sanitizer ( );
	hospital.bed (m1);
	hospital.bed (h4);
}


}
