package GraphAlgo;
//https://www.acmicpc.net/problem/1260

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph1260 {
	static int map[][];
	static int checkMap[];
	private static void dfs(int edge){
		checkMap[edge] = 1;
		System.out.println(edge);

		for(int i =edge; i<=4; i++)
		{
			if(map[edge][i]==1 && checkMap[i] ==0)
			{
				dfs(i);
			}
		}
	}
	private static void bfs(){
		Queue<Integer> q = new LinkedList<>();
		while(!q.isEmpty())
		{
			bfs();
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new int[n+1][n+1];
		checkMap = new int[n+1];
		int lineNum = sc.nextInt();
		int start = sc.nextInt();
		for(int i =0 ; i<lineNum; i++)
		{
			map[sc.nextInt()][sc.nextInt()] = 1;
		}
		dfs(start);
	}
}
