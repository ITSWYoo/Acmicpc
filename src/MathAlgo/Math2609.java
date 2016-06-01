package MathAlgo;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2609
public class Math2609 {
	private static Scanner sc = new Scanner(System.in);
	private static int gcd(int a , int b)
	{
		while(b!=0)
		{
			int result = a%b;
			a = b;
			b = result;
		}
		return a;
	}
	private static int lcm(int a, int b)
	{
		int result = gcd(a, b);
		return (result * a/result * b/result);
	}
	public static void main(String args[])
	{
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
	}
}
