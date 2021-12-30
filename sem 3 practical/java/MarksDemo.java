class Marks
{
	int M1,M2;
	Marks(int a,int b)
	{
		M1=a;
		M2=b;
		System.out.println("Inside marks constructor"+M1+" "+M2);
	}
}
class Marks1
{
	String name;
	Marks obj1=new Marks(88,99);
	Marks1(String n)
	{
		name=n;
		System.out.println("Inside Marks1 constructor");
	}
	double avg()
	{
		return (obj1.M1+obj1.M2)/2;
	}
	void display()
	{
		System.out.println("Name of student is "+name);
		System.out.println("Marks obtained in 1st subject are "+obj1.M1);
		System.out.println("Marks obtained in 2nd subject are "+obj1.M2);
		System.out.println("avg of both is "+avg());
	}
}
class MarksDemo
{
	public static void main(String arg[])
	{
		Marks1 m=new Marks1("Nikhil");
		m.display();
	}
}