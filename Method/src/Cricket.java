
public class Cricket {
	private String sname,loc,Time;
	int tprice;
	

	Cricket(String sname,String loc,String Time,int tprice)
	{
		this.sname=sname;
		this.loc=loc;
		this.Time=Time;
		this.tprice=tprice;
		System.out.println(this.sname+this.loc+this.Time+this.tprice);
	}
	void Player(String pname,String ptype,int run,int faceball,int dotball)
	{
		System.out.println("Player name :"+pname+"\nPlayer type :"+ptype+"\nRun :"+run+"Face of ball :"+faceball+"\nDot ball :"+dotball);
		
	}

	public static void main(String[] args) {
		Cricket c=new Cricket("Chinna swami stadium"," Bangluru", "7:30AM",1010);
		c.Player("Virat","Batsman", 123, 80, 20);
		c.Player("MS Dhoni", "Wicket keeper/Batsman",56, 40, 12);
		c.Player("Rhit","Batsman",23,12,3);

	}

}
