package Com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Retrive_in_Reverse_Order {

		 
		  public static void main(String[] args) {
			int n=12345;
			int sum= 0;
			while(n>0)
			{
				int r = n%10;
				sum = sum+r;
				n = n/10;
			}
			System.out.println(sum);
		}
		}


