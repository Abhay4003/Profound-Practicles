public class VarArgs
{
public void add (int ...arr)
{
System.out.println("no of arguments are="+arr.length);
int s=0;
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+"\t");
s=s+arr[i];
}
System.out.println("\n Sum="+s);
}
public static void main(String []args)
{
	VarArgs obj=new VarArgs();
	obj.add(22,32,55);
	obj.add(25,5,6,9,8,7);
}
}