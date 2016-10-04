package GraphAlgo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2178
public class Graph2178 {
	static int map[][];
	static int n,m;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	static int cnt = 0;
	static int min = -1;
	static Queue<Point> q = new LinkedList<Point>();
	class Point{
		int y,x;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 1; j <= m; j++) {
				char a = c[j - 1];
				if (a == '0')
					map[i][j] = 0;
				else
					map[i][j] = 1;
			}
		}
		dfs(1,1,1);
		System.out.println(min);
		
	}
	static void bfs()
	{
	}
	static void dfs(int y,  int x ,int cnt)
	{
		int ay, ax;
		if(y==n && x==m)
		{
			if(min ==-1)
				min = cnt;
			else min = min>cnt ? cnt : min;
			return;
		}
		for(int i = 0 ;i<4; i++)
		{
			ay = dy[i] +y;
			ax = dx[i] +x;
			if(ay<1 || ax<1 || ax>m || ay>n ) continue;
			if(map[ay][ax] == 1)
			{
				map[y][x] = 0;
				dfs(ay,ax,cnt+1);
				map[y][x] = 1;
			}
		}
	}
}
