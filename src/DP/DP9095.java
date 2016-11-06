package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
//https://www.acmicpc.net/problem/9095
public class DP9095 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        int dp[];
        int m[] = {0,1,2,3};
        int n;
        for(int i =1; i<=input; i++)
        {
            n= Integer.parseInt(bufferedReader.readLine());
            dp = new int[100001];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int j=4; j<=n; j++)
            {
                dp[j] =  dp[j-1]+dp[j-2]+dp[j-3];
            }
            System.out.println(dp[n]);
        }
    }
}
