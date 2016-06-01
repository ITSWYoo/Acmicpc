package DataStructureAlgo;
//https://www.acmicpc.net/problem/10828

import java.util.Scanner;
import java.util.Stack;

public class DataStructure10828 {
	private Scanner sc = new Scanner(System.in);
	private void myFunction(){
		int n = sc.nextInt();
		sc.nextLine();
		Stack<Integer> stack = new Stack<>();
		for(int i = 0 ; i<n; i++)
		{
			String line = sc.nextLine();
			String s[] = line.split(" ");
			
			if(s[0].equals("push"))
			{
				stack.push(Integer.parseInt(s[1]));
			}
			else if(s[0].equals("top"))
			{
				if(stack.isEmpty())
				{
					System.out.println(-1);
				}
				else System.out.println(stack.peek());
			}
			else if(s[0].equals("size"))
			{
				System.out.println(stack.size());
			}
			else if(s[0].equals("empty"))
			{
				if(stack.isEmpty())
				{
					System.out.println(1);
				}
				else System.out.println(0);
			}
			else if(s[0].equals("pop"))
			{
				if(stack.isEmpty())
				{
					System.out.println(-1);
				}
				else
					System.out.println(stack.pop());
			}
		}
	}
	public static void main(String args[])
	{
		new DataStructure10828().myFunction();
	}
}
