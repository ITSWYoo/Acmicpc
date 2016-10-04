package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/9095
public class DP9095 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int dp[] = new int[input + 1];
        int profit[] = new int[input + 1];
        for (int i = 1; i <= input; i++) {
            profit[i] = scanner.nextInt();
        }
        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[j] + profit[i-j]>dp[i]?dp[j] + profit[i-j]:dp[i];
            }
        }
        System.out.println(dp[input]);
    }
}
