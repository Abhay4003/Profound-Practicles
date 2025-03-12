import java.util.*;
public class Prime
{
public static void main(String [] args)
{
	System.out.println("Hello");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No");
	int n=sc.nextInt();
	int i=2;
	while (i<n)
{
	if(n%i==0)
	break;
	i++;
}
	if(i==n)
	System.out.println("Prime no");
  else
	System.out.println("Not Prime no"); 
}
}
 