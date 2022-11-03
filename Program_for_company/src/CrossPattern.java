	import java.util.Scanner;
	
	public class CrossPattern {
		 public static void main(String[] args)
		    {
		             
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter N : ");
			int n=sc.nextInt();	 
		    int k=n*2-1;
			for(int i=1;i<=k/2;i++)
		    {
				for(int j=1;j<=k;j++)
			    {     
					if(j==i || j==k-i+1)
						System.out.print(i);
					else if(i>n )
						System.out.print(j);
					System.out.print(" ");
			     }
			     System.out.println();
			    
		     }          
			for(int i=k/2+1;i>=1;i--)
			{
				for(int j=1;j<=k;j++)
				{
					if(j==i||j==k-i+1)
						System.out.print(i);
					System.out.print(" ");
				} 
				System.out.println(); 
			}
		              
		    }	
		 }
	/* public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
              char c = sc.next().charAt(0);
 
 
 
              int k=n*2-1;
 
	for(int i=1;i<=k;i++)
               {
                    
	        for(int j=1;j<=k;j++)
                
                        {      if(j==i || j==k-i+1)
                               System.out.print(c);
                                System.out.print(" ");
                                 
		 
                    	
                           }
		 
    
	 System.out.println();
	    
               }            
           
 
                
    }*/
	
