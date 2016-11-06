package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Yoo on 2016-10-12.
 */
public class Graph1766 {
    static int n, m;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        List<Integer>[] lists = new List[n + 1];
        int visited[] = new int[n + 1];

        for(int i =1; i<=n; i++)
        {
            lists[i] = new ArrayList<>();
        }

        for(int i =0;i<m; i++)
        {
            s = bufferedReader.readLine().split(" ");
            lists[Integer.parseInt(s[0])].add(Integer.parseInt(s[1]));
            visited[Integer.parseInt(s[1])]++;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i =1; i<=n; i++)
        {
            if(visited[i]==0)
                priorityQueue.offer(i);
        }

        while(!priorityQueue.isEmpty())
        {
            int x = priorityQueue.poll();
            System.out.print(x+ " ");

            for(int n: lists[x])
            {
                visited[n]--;
                if(visited[n]==0)
                {
                    priorityQueue.offer(n);
                }
            }
        }
    }
}
