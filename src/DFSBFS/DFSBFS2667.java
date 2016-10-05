package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yoo on 2016-10-05.
 */
public class DFSBFS2667 {
    private static int num;
    private static int map[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int home;
    static List<Integer> danNum = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bufferedReader.readLine());
        map = new int[num + 1][num + 1];

        for (int i = 1; i <= num; i++) {
            String s[] = bufferedReader.readLine().split("");
            for (int j = 1; j <= num; j++) {
                map[i][j] = Integer.parseInt(s[j - 1]);
            }
        }
        int result = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (map[i][j] != -1 && map[i][j] == 1) {
                    home = 1;
                    dfs(i, j);
                    result++; //단지수
                    danNum.add(home);
                }
            }
        }
        System.out.println(result);
        Collections.sort(danNum);
        for (int n : danNum) {
            System.out.println(n);
        }
    }

    public static void dfs(int y, int x) {
        int my, mx;
        map[y][x] = -1; //방문
        for (int i = 0; i < 4; i++) {
            my = y + dy[i];
            mx = x + dx[i];
            if (my < 1 || my > num || mx < 1 || mx > num) continue;
            if (map[my][mx] == 1) {
                home++;
                dfs(my, mx);
            }
        }
    }
}
