package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/2193
public class DP2193 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int dp[] = new int[input+1];
        dp[1] = 1;
        if(input >1)
        dp[2] = 1;

        if(input >2) {
            for (int i = 3; i <= input; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        System.out.println(dp[input]);
    }
}
