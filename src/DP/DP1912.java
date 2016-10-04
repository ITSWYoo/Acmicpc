package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/1912
public class DP1912 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int dp[] = new int[input+1];
        int num[] = new int[input+1];
        int result = -1000;
        for(int i =1 ; i<=input; i++)
        {
            num[i] = scanner.nextInt();
            dp[i] = num[i];
            if(dp[i] < dp[i-1]+num[i]){
                dp[i]= dp[i-1]+num[i];
            }
            if(result<dp[i])
                result = dp[i];
        }
        System.out.println(result);
    }
}
