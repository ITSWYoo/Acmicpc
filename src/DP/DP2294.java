package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-04.
 */
public class DP2294 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n, k;
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        int dp[] = new int[k + 1];
        int m[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            m[i] = Integer.parseInt(bufferedReader.readLine());
            if(m[i]<=k)
                dp[m[i]] = 1;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                if(i-m[j]>0)
                {
                    if(dp[i-m[j]]!=0) {
                        if(dp[i]==0)
                            dp[i] = dp[i - m[j]] + 1;
                        else{
                            dp[i]= dp[i]>dp[i-m[j]]+1?dp[i-m[j]]+1:dp[i];
                        }
                    }
                }
            }
        }
        if(dp[k]==0) System.out.println(-1);
        else System.out.println(dp[k]);
    }
}

