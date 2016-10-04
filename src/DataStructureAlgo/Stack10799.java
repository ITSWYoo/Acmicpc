package DataStructureAlgo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/10799
public class Stack10799 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else {
                if (input.charAt(i - 1) == '(') {
                    stack.pop();
                    cnt += stack.size();
                } else {
                    stack.pop();
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
