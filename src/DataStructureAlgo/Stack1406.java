package DataStructureAlgo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/1406
public class Stack1406 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        char arr[] = new char[60000];
        arr = inputStr.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Character> newStack = new Stack<>();
        int cusor;
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        cusor = stack.size();

        int caseNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < caseNum; i++) {
            inputStr = scanner.nextLine();
            if (inputStr.contains("P")) {
                char c = inputStr.charAt(2);
                stack.push(c);
            } else if (inputStr.contains("L")) {
                if (stack.size()!=0)
                {
                    newStack.push(stack.pop());
                }
            } else if (inputStr.contains("D")) {
                if (newStack.size()!=0)
                {
                    stack.push(newStack.pop());
                }
            } else if (inputStr.contains("B")) {
                if(stack.size()!=0)
                stack.pop();
            }
        }
        for (char c : stack) {
            System.out.print(c);
        }
        int size = newStack.size();
        for (int i =0; i<size;i++)
        {
            System.out.print(newStack.pop());
        }
    }
}
