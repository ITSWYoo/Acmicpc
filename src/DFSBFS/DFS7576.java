package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-05.
 */
//https://www.acmicpc.net/problem/7576
public class DFS7576 {
    static int map[][];
    static int m, n;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, 1, 0, -1};
    static int minDay;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        map = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            s = bufferedReader.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(s[j - 1]);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 1 && map[i][j] != -2) {
                    Point p = new Point();
                    p.y = i;
                    p.x = j;
                    queue.add(p);
                }
            }
        }
        bfs();
        for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=m; j++)
            {
                if(map[i][j] ==0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(minDay-1);

    }

    public static void bfs() {
        int cnt = 0;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.x;
            int y = p.y;
            int a = map[y][x];
            map[y][x] = -2;
            for (int i = 0; i < 4; i++) {
                int my = y + dy[i];
                int mx = x + dx[i];
                if (my < 1 || mx < 1 || my > n || mx > m) {
                    continue;
                }
                if (map[my][mx] == 0 && map[my][mx] != -2) {
                    map[my][mx] = a + 1;
                    if (minDay < a + 1) {
                        minDay = a + 1;
                    }
                    Point pp = new Point();
                    pp.y = my;
                    pp.x = mx;
                    queue.add(pp);
                }
            }
        }
    }

    public static class Point {
        int y, x;
    }
}
