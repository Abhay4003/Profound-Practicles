class Emp
{
	private int id;
	private String name;
	private double bs;
public Emp() {}
public Emp(int id,String name,double bs)
	{
		this.id=id;
		this.name=name;
		this.bs=bs;	
	}
public String toString()
	{
	return "\nId="+id + "\nName="+name+"\nBs="+bs;
	}
public double calsal()
	{
	return bs;
	}
}
class Wemp extends Emp
{
	private double hrs,rate;
	public Wemp()
	{
	super ();
	}
public Wemp(int id,String name,double bs,double hrs,double rate)
	{
	super (id,name,bs);
	this.hrs=hrs;
	this.rate=rate;
	}
public String toString()
	{
	return super.toString()+
	"\nHrs="+hrs+"\nRate="+rate;
	}
public double calsal()
{
	return super.calsal()+hrs*rate;
}
}
class Manager extends Emp
{
private double incentive;
public Manager() {}
public Manager(int id,String name,double bs,double inc)
{
	super(id,name,bs);
	this.incentive=inc;
}
public String toString()
{
	return super.toString()+"\nincentive="+incentive;
}
public double calsal()
{
	return super.calsal()+incentive; 	
}
}
public class Runt
{
	public static void main(String []args)
{
	Emp e=new Manager(1,"AAA",2000,500);
	System.out.println("Type of Obj="+e.getClass());
	System.out.println("e="+e);
	
	e=new Wemp (2,"ABC",20000,100,500);
	System.out.println("type of obj="+e.getClass());
	System.out.println("e="+e);
}
}
