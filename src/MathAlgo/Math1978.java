package MathAlgo;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1978
public class Math1978 {
	private Scanner sc = new Scanner(System.in);
	private static int primeCnt = 0;
	private void primeNumber(){
		int n = sc.nextInt();
		for(int i = 0; i <n; i++)
		{
			isPrime(sc.nextInt());
		}
		
	}
	private int isPrime(int a)
	{
		if(a<2)
			return 0;
		else
		{
			for(int i =2; i*i<a; i++)
			{
				if(a%i ==0)
					return 0;
			}
			primeCnt++;
			return 0;
		}
	}
	public static void main(String args[])
	{
		new Math1978().primeNumber();
		System.out.println(primeCnt);
	}
}
