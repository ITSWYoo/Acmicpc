package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-05.
 */
public class DP11047 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n, k;
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);

        int money[] = new int[n + 1];
//        int dp[] = new int[k + 1];
                for (int i = 1; i <= n; i++) {
            money[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int cnt = 0;
        for (int i = n; i >= 1; i--) {
                cnt += k / money[i];
                k = k % money[i];
        }
        System.out.println(cnt);
    }
}

//        for(int i =1; i<=k ; i++)
//        {
//            dp[i] = 10000000;
//        }

//        for(int i =1 ;i<=k; i++)
//        {
//            for(int j =1; j<=n; j++)
//            {
//                if(i-money[j]>0) {
//                    dp[i] = dp[i] > dp[i - money[j]] + dp[money[j]] ? dp[i - money[j]] + dp[money[j]] : dp[i];
//                }
//            }
//        }