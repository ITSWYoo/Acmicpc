package MathAlgo;
//https://www.acmicpc.net/problem/11653

import java.util.Scanner;

public class Math11653 {
	private Scanner sc = new Scanner(System.in);
	private void primeFactorization()
	{
		int n = sc.nextInt();
		
		for(int i =2; i*i<=n; i++)
		{
			while(n%i==0)
			{
				n = n/i;
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		new Math11653().primeFactorization();
	}
}
