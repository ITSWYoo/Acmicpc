package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-04.
 */
//https://www.acmicpc.net/problem/2096
public class DP2096 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        int dp[][] = new int[input + 1][4];
        int m[][] = new int[input + 1][4];

        for (int i = 1; i <= input; i++) {
            String s[] = bufferedReader.readLine().split(" ");
            for (int j = 1; j <= 3; j++) {
                m[i][j] = Integer.parseInt(s[j - 1]);
                if (i == 1) {
                    dp[1][j] = m[1][j];
                }
            }
        }

        for (int i = 2; i <= input; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    dp[i][j] = dp[i - 1][j] > dp[i - 1][j + 1] ? dp[i - 1][j] + m[i][j] : dp[i - 1][j + 1] + m[i][j];
                else if (j == 2) {
                    if (dp[i - 1][j - 1] > dp[i - 1][j]) {
                        if (dp[i - 1][j - 1] > dp[i - 1][j + 1]) dp[i][j] = dp[i - 1][j - 1] + m[i][j];
                        else dp[i][j] = dp[i - 1][j + 1] + m[i][j];
                    } else {
                        if (dp[i - 1][j] > dp[i - 1][j + 1]) dp[i][j] = dp[i - 1][j] + m[i][j];
                        else dp[i][j] = dp[i - 1][j + 1] + m[i][j];
                    }
                }else dp[i][j] = dp[i - 1][j-1] > dp[i - 1][j] ? dp[i - 1][j-1] + m[i][j] : dp[i - 1][j] + m[i][j];
            }
        }
        int max = 0;
        for(int i = 1; i<=3; i++)
        {
            if(max<dp[input][i])
            {
                max = dp[input][i];
            }
        }

        for (int i = 2; i <= input; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    dp[i][j] = dp[i - 1][j] < dp[i - 1][j + 1] ? dp[i - 1][j] + m[i][j] : dp[i - 1][j + 1] + m[i][j];
                else if (j == 2) {
                    if (dp[i - 1][j - 1] < dp[i - 1][j]) {
                        if (dp[i - 1][j - 1] < dp[i - 1][j + 1]) dp[i][j] = dp[i - 1][j - 1] + m[i][j];
                        else dp[i][j] = dp[i - 1][j + 1] + m[i][j];
                    } else {
                        if (dp[i - 1][j] < dp[i - 1][j + 1]) dp[i][j] = dp[i - 1][j] + m[i][j];
                        else dp[i][j] = dp[i - 1][j + 1] + m[i][j];
                    }
                }else dp[i][j] = dp[i - 1][j-1] < dp[i - 1][j] ? dp[i - 1][j-1] + m[i][j] : dp[i - 1][j] + m[i][j];
            }
        }
        int min = 100000;
        for(int i = 1; i<=3; i++)
        {
            if(min>dp[input][i])
            {
                min = dp[input][i];
            }
        }
        System.out.println(max+" "+min);
    }
}
