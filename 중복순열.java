
public class Solution {
	static int [] a = {1,2,3,4,5};
	static int [] p = new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0, 3, 5);
	}
	public static void f(int n, int k, int m)
	{
		if(n==k)
		{
			for(int i=0; i<k; i++)
				System.out.print(p[i]);
			System.out.println();
		}
		else
		{
			for(int i =0; i<m; i++)
			{
				p[n] = a[i];
				f(n+1, k, m);
			}
		}
	}
}
