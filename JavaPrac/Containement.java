class Emp
{
private int id;
private String name;
private double salary;
private myDate jdate;
public Emp()
{
id=0;
name=" ";
salary=0;
jdate=new myDate();
}
public Emp(int id,String name,double salary,myDate jdate)
{
this.id=id;
this.name=name;
this.salary=salary;
this.jdate=jdate;
}
public String toString()
{
	return "\nId="+id +"\nName="+name+"\nSalary="+salary+"\njdate="+jdate;
}
}
public class Containement
{
public static void main(String []args)
{
Emp e1=new Emp();
System.out.println("e1="+e1);
Emp e2=new Emp(1,"ABC",402505,new myDate(12,12,2012));
System.out.println("e2="+e2);
}
}