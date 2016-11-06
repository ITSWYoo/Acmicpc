package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Yoo on 2016-10-11.
 */
public class BestProfit {
    public static void main(String args[]) throws IOException {

        int n, m;
        int dp[][];
        int profit[][];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(inputStr[0]);
        m = Integer.parseInt(inputStr[1]);
        profit = new int[n + 1][m + 1];
        dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String profitStr[] = bufferedReader.readLine().split(" ");
            for (int j = 1; j <= profitStr.length; j++) {
                profit[i][j] = Integer.parseInt(profitStr[j - 1]);
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int max = -1;
                for (int k = 0; k <= j; k++) {
                     int t = dp[k][i-1] + profit[j-k][i];
                    if(t>max)
                        max =t;
                }
                dp[j][i] = max;
                System.out.println(dp[j][i] +" ");
            }
            System.out.println();
        }
        System.out.println(dp[n][m]);
    }
}
