import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int[] a = {1,2,3};
	static int[] l = new int[3];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		subset(0, 3);
	
	}
	public static void subset(int n, int k)
	{
		if(n==k)
		{
			for(int i=0; i<k; i++)
			{
				//System.out.print(l[i]);
				if(l[i]==1)
					System.out.print(a[i]);
			}
			System.out.println();
		}
		else
		{
			l[n] = 0;
			subset(n+1, k);
			l[n] = 1;
			subset(n+1, k);
			
		}
	}
}
