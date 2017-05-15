
public class Solution {
	static int [] a = {1,2,3};
	static int [] b = {1,2,3,4,5};
	static int [] p = new int[3];
	static int [] used = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//f(0, 3);
		f2(0, 3, 5); // f2(0, 3, 3) == f(0, 3)
	}
	// 주어진 숫자의 개수와 채울 칸 수가 같은 경우..
	public static void f(int n, int k)
	{
		if(n==k)
		{
			for(int i=0; i<k; i++)
				System.out.print(p[i]);
			System.out.println();
		}
		else
		{
			for(int i= 0; i<k; i++)
			{
				if(used[i]==0)
				{
					p[n] = a[i];
					used[i] = 1;
					f(n+1, k);
					used[i] = 0;
				}
			}
		}
	}
	// 주어진 수자의 개수가 채울 칸 수 보다 많은 경우...
	public static void f2(int n, int k, int m)
	{
		if(n==k)
		{
			for(int i=0; i<k; i++)
				System.out.print(p[i]);
			System.out.println();
		}
		else
		{
			for(int i= 0; i<m; i++)
			{
				if(used[i]==0)
				{
					p[n] = b[i];
					used[i] = 1;
					f2(n+1, k, m);
					used[i] = 0;
				}
			}
		}
	}
}
