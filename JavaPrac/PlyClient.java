class Player
{
	private String name,country;
	private int matches;

	
	public Player(String name,String country,int matches)
	{
		this.name=name;
		this.country=country;
		this.matches=matches;
	}
	public String toString()
	{
		return "\n name="+name + "/n country="+country +"\nmatches="+matches;
	}
}
class Batsman extends Player
{
	private int runs;
	
	public Batsman(String name,String country,int matches,int runs)
	{
		super(name,country,matches);
		this.runs=runs;	
	}
	public String toString()
	{
		return "\nruns="+runs+"\n"+super.toString();
	}
}
class Bolwers extends Player
{
	private int wickets;
	
	public Bolwers(String name,String country,int matches,int wickets)
	{
		super(name,country,matches);
		this.wickets=wickets;	
	}
	public String toString()	
	{
		return "\nwickts="+wickets+super.toString();
	}
}

public class PlyClient
{
	public static void main(String []args)
	{
	
	Batsman bt=new Batsman("Sachin.t","India",1000,502581);
	System.out.println(bt);	
	Bolwers b2=new Bolwers("Bhumara","Ind",250,500);
	System.out.println(b2);
	
	}
}