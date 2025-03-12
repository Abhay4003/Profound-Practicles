public class Book
{
private String book_name;
private String Auther_nm;
private int Price;

public Book()
{
book_name="Sham Chi aai";
Auther_nm="Sane guruji";
Price=150;
}
public void disp()
{
System.out.println("Book Name= "+book_name);
System.out.println("Auther Name= "+Auther_nm);
System.out.println("Price Tag= "+Price);
}
public static void main(String []args)
{
	Book b1=new Book();
	 b1.disp();
}
}