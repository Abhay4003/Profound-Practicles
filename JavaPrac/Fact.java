import java.util.*;
public class Fact
{
public static void main(String [] args)
{
System.out.println("Hello");
Scanner sc=new Scanner(System.in);
System.out.println("Enter No");
int n=sc.nextInt();
int f=1;
while(n != 1)
{
f=f*n;
n--;
}
System.out.println("Fact is"+f);
}
}
 