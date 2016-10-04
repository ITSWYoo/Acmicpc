package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/2156
public class DP2156 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int dp[] = new int[input+1];
        int m[] = new int[input+1];
        for(int i =1 ; i<=input; i++)
        {
            m[i] = scanner.nextInt();
        }
        dp[1] = m[1];
        if(input>1) dp[2] = m[1]+m[2];
        for(int i =3 ; i<=input; i++)
        {
            dp[i] = dp[i-1];
            dp[i] = dp[i]<dp[i-2]+m[i]?dp[i-2]+m[i]:dp[i];
            dp[i] = dp[i]<dp[i-3]+m[i-1]+m[i]?dp[i-3]+m[i-1]+m[i]:dp[i];
        }
        System.out.println(dp[input]);
    }
}
