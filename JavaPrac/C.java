class  A 
{

public int Mul;
public A()
{
System.out.println("Default Constructor...");
}
public void add(){
System.out.println("Hello N.."+Mul);
}
}

class C
{
public static void main(String []args)
{
A p=new A();
p.add();

}
}
