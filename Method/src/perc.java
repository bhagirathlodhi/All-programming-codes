
public class perc {
      int Calculate(int a,int b,int c)
      {
    	  
    	  return a+b+c;
      }
      void Calculate1(double sum)
      {
    	  double p=(sum/300)*100;
    	  System.out.println(p);
      }
      
	public static void main(String[] args) {
		perc p=new perc();
		int x=p.Calculate(78, 67, 78);
		System.out.println("");
		System.out.println(x);
		p.Calculate1(x);
		

	}

}
