package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/11057
public class DP11057 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long dp[][] = new long[input+1][10];
        long mod = 10007;

        for(int i =0; i<=9; i++)
        {
            dp[1][i] = 1;
        }

        for(int i =2 ; i<=input; i++)
        {
            for(int j = 0; j<=9; j++)
            {
                for(int k =0; k<=j; k++)
                {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= mod;
                }
            }
        }
        long result = 0;
        for(int i =0; i<=9;i++)
        {
            result += dp[input][i];
        }
        result %=mod;
        System.out.println(result);
    }
}
