import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c = sc.nextInt();
		int mat[][] =new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			for(int j = 0;j<mat[0].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<mat.length;i++)
		{
			for(int j = 0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<mat.length;i++)
		{
			for(int j = 0;j<mat[0].length;j++)
			{
				
			}
			System.out.println();
		}
	}

}
