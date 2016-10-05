package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/9084
public class DP9084 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(bufferedReader.readLine());
        int n;
        int money[];
        int dp[];
        int goal;
        for (int i = 0; i < caseNum; i++) {
            n = Integer.parseInt(bufferedReader.readLine());
            String s[] = bufferedReader.readLine().split(" ");
            money = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                money[j] = Integer.parseInt(s[j - 1]);
            }
            goal = Integer.parseInt(bufferedReader.readLine());
            dp = new int[goal+1];
            dp[0] =1;

            for(int j=1; j<=n; j++)
            {
                for(int k=money[j]; k<=goal; k++)
                {
                    dp[k] += dp[k-money[j]];
                }
            }
            System.out.println(dp[goal]);
        }
    }
}
