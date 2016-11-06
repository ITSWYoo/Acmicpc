package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Yoo on 2016-10-13.
 */
public class Graph1922 {
    static int n, m;
    static List<Edge> edgeList[];
    static int visited[];
    static int result;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        edgeList = new List[n+1];
        visited = new int[n+1];
        for(int i=1; i<=n; i++)
        {
            edgeList[i] = new ArrayList<>();
        }
        for(int i =1; i<=m; i++)
        {
            String inputStr[] = bufferedReader.readLine().split(" ");
            int start = Integer.parseInt(inputStr[0]);
            int end = Integer.parseInt(inputStr[1]);
            int cost = Integer.parseInt(inputStr[2]);
            edgeList[start].add(new Edge(end,cost));
            edgeList[end].add(new Edge(start,cost));
        }
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(1, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Integer.compare(o1.cost,o2.cost);
            }
        });

        visited[1]= 1;
        for(Edge edge: edgeList[1]) {
            priorityQueue.offer(edge);
        }

        while(!priorityQueue.isEmpty()){

            Edge popEdge = priorityQueue.poll();
            int popEnd = popEdge.end;
            int popCost = popEdge.cost;
            if(visited[popEnd]==0)
            {
                result += popCost;
                visited[popEnd] = 1;
            }

            for(Edge edge: edgeList[popEnd])
            {
                if(visited[edge.end]==0) {
                    priorityQueue.add(edge);
                }
            }
        }
        System.out.println(result);
    }
    public static class Edge{
        int end,cost;

        public Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }
}
