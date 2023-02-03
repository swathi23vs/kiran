package poly1;
class Zomato
{
	void food ( )
	{
		System.out.println("biryani");
	}
}
class  hotel1 extends Zomato
{
	void food ( )
	{
		System.out.println("veg");
	}
}
class hotel2 extends   Zomato
{
	void food ( )
	{
		System.out.println("biryani");
	}
}
class  customer 
{
	static void plate (Zomato z1 )
	{
		z1.food( );
	}
}

public class poly2 {
	public static void main(String[]args)
	{
	
	hotel1 h3=new hotel1( );
	hotel2 h4=new hotel2( );
	customer.plate(h3);
	customer.plate(h4);
}


}
