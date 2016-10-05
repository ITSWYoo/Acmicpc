package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-05.
 */
//https://www.acmicpc.net/problem/1260
public class DFSBFS1260 {
    private static int n,m,start;
    private static int check[];
    private static int map[][];
    private static Queue<Integer> queue;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        start = Integer.parseInt(s[2]);

        check = new int[n + 1];
        map = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            s = bufferedReader.readLine().split(" ");
            map[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = map[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = 1;
        }
        queue = new LinkedList<>();
        bfs(start);

    }
    public static void dfs(int start){
        check[start] = 1;
        System.out.print(start+"->");
        for(int i = start; i<=n; i++)
        {
            if(map[start][i]==1 && check[i]==0)
            {
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        check[start] = 1;
        queue.add(start);
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll()+"-");
            for(int i = start; i<=n; i++)
            {
                if(map[start][i] ==1 && check[i]==0)
                {
                    check[i] = 1;
                    queue.add(i);
                }
            }
        }
    }
}
