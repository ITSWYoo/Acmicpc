package DataStructureAlgo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/9012
public class Stack9012 {
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        int caseNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < caseNum; i++) {
            if(myFunction(scanner.nextLine().trim())) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean myFunction(String inputStr) {
        Stack<Character> myStack = new Stack<>();
        int cnt =0;
        for (int i = 0; i < inputStr.length(); i++) {
            myStack.push(inputStr.charAt(i));
        }

        if (myStack.peek() == '(') {
            return false;
        } else {
            int size = myStack.size();
            for (int i = 0; i < size; i++) {
                char c = myStack.pop();
                if (c == ')') {
                    cnt++;
                } else {
                    if(cnt ==0) return false;
                    cnt--;
                }
            }
        }

        if (cnt == 0) return true;
        else return false;
    }
}
