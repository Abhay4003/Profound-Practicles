class Emp
{
private int id;
private String name;
private double salary;
private static int cnt;

public Emp()
	{
	 cnt++;
	}
public Emp(int id,String name,double salary)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
	cnt++;
	}
public String toString()
	{
	return "\n id="+id + "\n name="+name +"\n salary="+salary;
	}
public static int getCnt()
	{
	return cnt;
	} 
}
public class EmpClient
	{
public static void main(String [] args)
{
	Emp e1= new Emp();
	Emp e2= new Emp(22,"AAA",25000);
	System.out.println("e1="+e1);
	System.out.println("e2="+e2);
	System.out.println("no of object are"+Emp.getCnt());
	}
}