import java.util.*;
public class Reverse
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No");
	int n=sc.nextInt();
	int d,rev=0;
	while(n!=0)
{
	d=n%10;
	rev=rev*10+d;
	n=n/10;
}
	System.out.println("Reverse No="+rev);
}
}