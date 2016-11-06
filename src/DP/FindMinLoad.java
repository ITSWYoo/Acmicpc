package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-07.
 */
public class FindMinLoad {
    static int n, m;
    static int map[][];
    static int dp[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};
    static int min = 100000;
    static int result = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(inputStr[0]);
        m = Integer.parseInt(inputStr[1]);
        map = new int[n + 1][m + 1];
        dp = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String s[] = bufferedReader.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(s[j - 1]);
            }
        }
        for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=m; j++)
            {
                if(map[i][j] ==1)
                if(i==1&& j==1) dp[i][j]=1;
                else
                    dp[i][j] = dp[i-1][j]+ dp[i][j-1];

                System.out.println("dp["+i+"]["+j+"] = "+dp[i][j]);
            }
        }
        System.out.println(dp[n][m]);
//        dfs(1, 1, 0);
//        System.out.println(result);
    }

    public static void dfs(int y, int x, int cnt) {
        map[y][x] = 0;
        if(y==n && x ==m) {
            if (min > cnt) {
                min = cnt;
                result = 1;
            } else if(min == cnt)
            {
                result++;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int my, mx;
            my = y + dy[i];
            mx = x + dx[i];
            if (my < 1 || mx < 1 || my > n || mx > m) continue;
            if (map[my][mx] == 1) {
                cnt++;
                map[my][mx] = 0;
                dfs(my, mx, cnt);
                cnt--;
                map[my][mx] = 1;
            }
        }
    }
}
