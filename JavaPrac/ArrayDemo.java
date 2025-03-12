import java.util.*;
class ArrayDemo
{
public static void main(String []args)
	{
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int n=sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter"+n+"element");
	for(i=0;i<arr.length;i++)
	arr[i]=sc.nextInt();
	System.out.println("Array ele are=");
	for(i=0;i<arr.length;i++)
System.out.println(arr[i]+"\t");
	}
}
//for(int n:arr)
//System.out.println(n);