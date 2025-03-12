class Book
{
	private String bname,author;
	private double price;
public Book (String bname,String author,double price)
{
	this.bname=bname;
	this.author=author;
	this.price=price;
}
public String toString()
{
//this.current obj
	return "\n Book Name="+this.bname
	+"\n Book Auther="+this.author
	+"\n Book Price="+this.price;
}
}
public class BookClient
{
	public static void main(String [] args)
	{
	
	Book b1=new Book("AAA","ABC",9000);
	
	System.out.println(b1);
}
}
