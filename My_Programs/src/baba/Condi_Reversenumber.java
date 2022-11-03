package baba;
import java.util.Scanner;
public class Condi_Reversenumber {

	public static void main(String[] args) {
          int n;
          System.out.println("Enter value of n:-");
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          for(int i = n;i>=1;i--)
          {
        	 System.out.println(i); 
          }
	}

}
