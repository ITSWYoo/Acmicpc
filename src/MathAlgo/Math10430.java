package MathAlgo;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10430
public class Math10430 {
	private Scanner sc = new Scanner(System.in);
	private void myFunction(){
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
	}
	public static void main(String args[])
	{
		new Math10430().myFunction();
	}
}
