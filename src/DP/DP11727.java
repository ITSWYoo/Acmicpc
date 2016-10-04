package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
public class DP11727 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int dp[] = new int[input+1];

        dp[1] = 1;
        if(input>1)
        dp[2] = 3;

        for(int i =3; i<=input; i++)
        {
            dp[i] = 2*dp[i-2] + dp[i-1];
            dp[i] %= 10007;
        }
        System.out.println(dp[input]);
    }
}
