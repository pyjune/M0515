import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			long sum = 0;
			for(int i = a+1; i<b; i++)
			{
				if(f(i)==1)
					sum += (long) i;
			}
			System.out.println("#"+tc + " "+sum);
		}
	}
	public static int f(int n)
	{
		if(n==2)
			return 1;
		else if(n%2==0)
			return 0;
		else
		{
			for(int i = 3; i*i<= n; i++)
			{
				if(n%i==0)
					return 0;
			}
			return 1;
		}
	}
}
