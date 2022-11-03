
public class Missing_element_in_the_Array {
	public static void main(String[] args) {
		int ar1[]= {5,3,5,1,4,7};
		int ar2[]= {5,3,5,4,7};
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println(i+" missing element is :"+ar1[i]);
				break;
			}
		}
		
	}

}
