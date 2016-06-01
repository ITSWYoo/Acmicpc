package MathAlgo;
//https://www.acmicpc.net/problem/1850

import java.util.Scanner;

public class Math1850 {
	private static Scanner sc = new Scanner(System.in);
	private void gcm(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b%a==0)
			for(int i = 0 ; i<a; i++)
			{
				System.out.print(1);
			}
		else
			System.out.println(1);
	}
	public static void main(String args[])
	{
		new Math1850().gcm();
	}
}
