package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/1010
public class DP1010 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(bufferedReader.readLine());
        int n,m;
        int dp[][];
        for(int i =0 ; i<caseNum; i++)
        {
            String s[] = bufferedReader.readLine().split(" ");
            n = Integer.parseInt(s[1]);
            m = Integer.parseInt(s[0]);
            dp= new int[n+1][m+1];
            for(int z =0; z<=n; z++)
            {
                dp[z][0] = 1;
            }
            for(int z = 0; z<=m; z++)
            {
                dp[z][z] = 1;
            }
            for(int j =1; j<=n; j++)
            {
                for(int k = 1; k<=m; k++)
                {
                    if(j==k) continue;
                    dp[j][k] = dp[j-1][k-1]+dp[j-1][k];
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}
