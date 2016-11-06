package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-15.
 */
public class DP1463 {
    static int n;
    static int dp[];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        dp = new int[n+1];
        for(int i =2; i<=n; i++) {
            dp[i] = dp[i-1]+1;
            if (n % 3 == 0)
                dp[i] = dp[n/3] + 1;
            if (n % 2 == 0)
                dp[i] = dp[n/2] + 1;

            System.out.print(i+":"+dp[i]+" ");
        }
        System.out.println();
        for(int i=1; i<=n; i++) {
            System.out.print(dp[i]+" " );
        }
    }
}
