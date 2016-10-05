package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-05.
 */
public class DP2293 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        int n,k;
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        int money[] = new int[n+1];
        int dp[] = new int[k+1];

        for(int i=1; i<=n; i++)
        {
            money[i] = Integer.parseInt(bufferedReader.readLine());
        }

        dp[0] =1;
        for(int i=1; i<=n; i++)
        {
            for(int j=money[i]; j<=k; j++)
            {
                dp[j] += dp[j-money[i]];
            }
        }
        System.out.println(dp[k]);

    }
}
