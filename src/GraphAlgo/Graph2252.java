package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-12.
 */
public class Graph2252 {
    static int n, m;
    static List<Integer>[] lists;
    static int visited[];

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        lists = new List[n + 1];
        visited = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            s = bufferedReader.readLine().split(" ");
            lists[Integer.parseInt(s[0])].add(Integer.parseInt(s[1]));
            visited[Integer.parseInt(s[1])]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int n : lists[x]) {
                visited[n]--;
                if (visited[n] == 0) {
                    queue.add(n);
                }
            }
        }
    }
}
