#include <iostream>
int a[] = {0,1,2,3,4,5,6,7,8,9};
int p[10];
int used[10]; 
int t[10][10];
int min;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void perm(int n, int k, int m, int s);
int main(int argc, char** argv) {
	int tc, T;
	freopen("input.txt", "r", stdin);
	scanf("%d", &T);
	for(tc=1;tc<=T;tc++)
	{
		int N;
		scanf("%d", &N);
		min = 0x7fffffff;
		for(int i = 0; i<N;i++)
		{
			for(int j =0; j<N; j++)
			{
				scanf("%d", &t[i][j]);
			}
		}
		perm(0, N, N, 0);
		printf("#%d %d\n", tc, min);
	}
	
	return 0;
}

void perm(int n, int k, int m, int s)
{
	if (n == k)
	{
		if(min>s)
			min = s;
	}
	else if(s>=min)
		return;
	else
	{
		for (int i = 0; i < m; i++)
		{
			if (used[i] == 0)
			{
				used[i] = 1;
				p[n] = a[i];
				perm(n+1, k, m, s+t[a[i]][n]);
				used[i] = 0;
			}
		}
	}
} 
