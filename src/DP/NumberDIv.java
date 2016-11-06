package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-07.
 */
public class NumberDIv  {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        String[] inputStr = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(inputStr[0]);
        m = Integer.parseInt(inputStr[1]);

        int dp[] = new int[n+1];
        int arr[] = new int[m+1];
        for(int i =1; i<=m; i++)
        {
            arr[i] = i;
        }
        dp[0] =1;

        for(int i =1; i<=m; i++)
        {
            for(int j =arr[i]; j<=n; j++)
            {
                dp[j]+= dp[j-arr[i]];
            }
        }
        System.out.println(dp[n]);
    }
}
