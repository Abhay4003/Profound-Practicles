import java.util.*;
public class Demo1
{
public static void main(String [] args)
{

	System.out.println("Hello..");
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter roll no");
	int r=sc.nextInt();

	System.out.println("Enter Name");
	sc.nextLine();

	String name=sc.nextLine();
	System.out.println("Enter Marks");

	Float m=sc.nextFloat();
	System.out.println("Roll no ="+r);

	System.out.println("name ="+name);
	System.out.println("Marks ="+m);
}
}
 