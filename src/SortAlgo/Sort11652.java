package SortAlgo;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11652
public class Sort11652 {
	private Scanner sc = new Scanner(System.in);
	private void mySort()
	{
		int n = sc.nextInt();
		int card[] = new int[n];
		
		for(int i= 0 ; i<n; i++)
		{
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		int maxCnt = 1;
		long ans = card[0];
		int cnt = 1;
		for(int i = 1 ; i<card.length; i++)
		{
			if(card[i]==card[i-1])
			{
				cnt+=1;
			}
			else
			{
				cnt =1;
			}
			if(maxCnt < cnt)
			{
				maxCnt = cnt;
				ans = card[i];
			}
		}
		System.out.println(ans);
	}
	public static void main(String args[])
	{
		new Sort11652().mySort();
	}
}
