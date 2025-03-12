import java.util.*;
public class Prime1
{
public static void main(String [] args)
{
int n,i=0;
for(n=2;n<=100;n++)
{

i=2;
while(i<n) 
{
if (n%i==0)
	break;
i++;

}if(i==n)	
System.out.print("\t"+n);
}
}
}