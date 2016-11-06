package CodeGround;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-10.
 */
public class Combination {
    static int testNum;
    static int n, m;
    static int dp[][];
    static int result = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        testNum = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testNum; i++) {
            String inputStr[] = bufferedReader.readLine().split(" ");
            n = Integer.parseInt(inputStr[0]);
            m = Integer.parseInt(inputStr[1]);
            dp = new int[n + m+ 1][n+1];
            dp[0][0] = 1;
            for (int j = 0; j <= n; j++) {
                for (int k = j; k <= j+m; k++) {
                    if (j == 0 || k == 0) {
                        dp[k][j] = 1;
                    }
                    else {
                        dp[k][j] = dp[k - 1][j - 1]%1000000007 + dp[k - 1][j]%1000000007;
                    }
                    result += dp[k][j];
                }
            }
            System.out.println(result%1000000007);
            result = 0;
        }
    }
}
