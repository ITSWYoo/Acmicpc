package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/2579
public class DP2579 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int stair[] = new int[input+1];
        int dp[] = new int[input+1];
        for(int i =1 ; i<=input; i++)
        {
            stair[i] = Integer.parseInt(br.readLine());
        }
        if (input>0)
        dp[1] = stair[1];
        if(input>1)
        dp[2] = stair[1]+stair[2];

        for(int i =3; i<=input; i++)
        {
            dp[i] = dp[i-3]+stair[i-1]+stair[i];
            if(dp[i] <dp[i-2] +stair[i]) dp[i] = dp[i-2]+stair[i];
        }
        System.out.println(dp[input]);
    }
}
