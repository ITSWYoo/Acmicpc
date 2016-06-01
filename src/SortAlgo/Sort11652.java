package SortAlgo;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11652
public class Sort11652 {
	private Scanner sc = new Scanner(System.in);
	private void mySort()
	{
		int n = sc.nextInt();
		long card[] = new long[n];
		
		for(int i= 0 ; i<n; i++)
		{
			card[i] = sc.nextLong();
		}
		Arrays.sort(card);
		long maxValue= card[0];
		
		int maxCnt = 0;
		int cnt = 1;
		
		for(int i = 1 ; i<card.length; i++)
		{
			if(card[i]==card[i-1])
			{
				cnt++;
			}
			else
			{
				cnt =1;
			}
			if(maxCnt < cnt)
			{
				maxCnt = cnt;
				maxValue = card[i];
			}
		}
		System.out.println(maxValue);
	
	}
	public static void main(String args[])
	{
		new Sort11652().mySort();
	}
}
