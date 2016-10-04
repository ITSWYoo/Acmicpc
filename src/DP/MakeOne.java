package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/1463
public class MakeOne {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        int dp[] = new int[n+1];

        for(int i =2; i<=n; i++)
        {
            dp[i] = dp[i-1]+1;
            if(i%2 ==0) dp[i] = dp[i]>dp[i/2]+1?dp[i/2]+1:dp[i];
            if(i%3 ==0) dp[i] = dp[i]>dp[i/3]+1?dp[i/3]+1:dp[i];
        }
        System.out.println(dp[n]);
    }
}
