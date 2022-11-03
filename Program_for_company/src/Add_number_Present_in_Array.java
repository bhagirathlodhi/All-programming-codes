
public class Add_number_Present_in_Array {
	public static void main(String[] args) {
		int ar[]= {-1,-8,0,5,-9};
		int sum=0;
		int arr[] = new int[2];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=1||ar[i]!=4)
			{
				arr[i]=ar[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
