public class Fact1
{
public static void main(String []args)
{
int n=Integer.parseInt(args[0]);
int f=1;
while (n!=1)
{
f=f*n;
n--;
}
System.out.println("Fact is "+f);
}
}

