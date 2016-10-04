package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */

//https://www.acmicpc.net/problem/10844
public class DP10844{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long dp[][] = new long[input+1][10];
        long mod = 1000000000;

        for(int i =1; i<=9; i++)
        {
            dp[1][i] = 1;
        }

        for(int i =2; i<=input; i++)
        {
            for(int j = 0; j<=9; j++) {
                dp[i][j] = 0;

                if(j-1 >=0) dp[i][j] += dp[i-1][j-1];
                if(j+1 <=9) dp[i][j] += dp[i-1][j+1];
                dp[i][j] %= mod;
            }
        }

        int result = 0;
        for(int i =0; i<=9; i++)
        {
            result += dp[input][i];
        }
        result %= mod;
        System.out.println(result);
    }
}
