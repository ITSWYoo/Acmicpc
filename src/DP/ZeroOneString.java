package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
public class ZeroOneString {
    static int input;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        System.out.println(dp(input));
    }
    public static int dp(int i)
    {
        if(i==1) return 2;
        if(i==2) return 3;
        else return dp(i-1)+ dp(i-2);
    }
}
