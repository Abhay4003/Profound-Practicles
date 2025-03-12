class myDate
{
	private int day,month,year;
	public myDate(){}
	public myDate(int day,int month,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year; 
	}
	public String toString()
{
	return day +"/"+month +"/"+year;
}
public int getDay()
{
return day;
}
public int getMonth()
{
return month;
}
public int getYear()
{
return year;
}
public void setDay(int day)
{
this.day=day;
}
public void setMonth(int month)
{
this.month=month;
}
public void setYear(int year)
{
this.year=year;
}
}
public class DataClient
{
public static void main(String []args)
{
myDate d = new myDate();
System.out.println("d="+d);
d.setDay(5);
d.setMonth(4);
d.setYear(2004);
System.out.println("After setter");
System.out.println("Day="+d.getDay());
System.out.println("Month="+d.getMonth());
System.out.println("Year="+d.getYear());
}
}
