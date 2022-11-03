import java.util.Scanner;

public class SumOfArray {
	static int arr[] = { 1,2,3,4,5 };
    static int sum()
    {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)
            sum = sum+ arr[i];
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println( sum());
    }
	}


