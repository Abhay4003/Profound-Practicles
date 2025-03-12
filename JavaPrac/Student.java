public class Student
{
private int roll_no;
private String name;
private double marks;

public Student()
{
System.out.println("No Args Constructor");
}
public Student(int r,String nm,double m)
{
	roll_no=r;
	name=nm;
	marks=m;
}
	public void disp()
	{
	System.out.println(roll_no);
	System.out.println(name);
	System.out.println(marks);
}
public static void main (String []args)
{
	Student a1=new Student();
	a1.disp();
	Student a2=new Student(1,"ABC",55.40);
	a2.disp();

	     
}
}