import java.util.*;
public class Menu
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String ans=" ";
do
{
	System.out.println("Menu\n1)Add\n2)Sub");
	System.out.println("Enter Choice");
	int ch=sc.nextInt();
	System.out.println("Enter 1st Number");
	int x=sc.nextInt();
	System.out.println("Enter 2nd Number");
	int y=sc.nextInt();
switch(ch)
{
	case 1:System.out.println("Add is"+(x+y));
	break;
	case 2:System.out.println("Sub is"+(x-y));
	break;
	default:System.out.println("Invalid choice");
break;
}
System.out.println("Do you Want to Continue?(y/n)");
ans=sc.next();
}
while(ans.equals("Y") || ans.equals("y"));
}
}