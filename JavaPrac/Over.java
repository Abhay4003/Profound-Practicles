import java.util.*;
class Over
{
	private int r,l,b;
	public Over() {}

	public void area(int r)
	{
		r=r;
	System.out.println("Area of Cicle is "+(3.14*r*r));
	}
public void area(int l,int b)
	{
	l=l;
	b=b;
	System.out.println("Area of Rectange is "+(l*b));
	}
public static void main(String []args)
	{
	Over ob=new Over();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number");
	int a=sc.nextInt();
	System.out.println("ENter Rec number");
	int b=sc.nextInt();
	int c=sc.nextInt();
	ob.area(a);
	ob.area(b,c);
	}

}