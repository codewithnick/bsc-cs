import java.util.*;
class customer
{
	void numb(int n)
	{
		int x;
		x=n;
		System.out.println("Customer number is "+x);
	}
	void name(String s)
	{
		String na;
		na=s;
		System.out.println("Customer name is "+na);
	}
	void city(String c)
	{
		String ci;
		ci=c;
		System.out.println("Customer name is "+ci);
	}
}
class customerDemo
{
	public static void main(String arg[])
	{
		customer c=new customer();
		customer c1=new customer();
		System.out.println("Getter Method");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Customer number");
		int z=in.nextInt();
		Scanner i=new Scanner(System.in);
		System.out.println("Enter Customer name");
		String a;
		a=i.nextLine();
		Scanner ix=new Scanner(System.in);
		System.out.println("Enter Customer city");
		String f;
		f=ix.nextLine();
		c.numb(z);
		c.name(a);
		c.city(f);
		System.out.println("-------------------------------");
		System.out.println("Setter Method");
		c1.numb(50);
		c1.name("Shubham");
		c1.city("Mum");	
	}
}