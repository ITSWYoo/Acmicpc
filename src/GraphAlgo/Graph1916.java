package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Graph1916 {
    static int n,m;
    static int distance[];
    static int visited[];
    static List<Edge>[] edgeList;
    static int startP,endP;
    static PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(1, new Comparator<Edge>() {
        @Override
        public int compare(Edge o1, Edge o2) {
            return Integer.compare(o1.cost,o2.cost);
        }
    });
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        m = Integer.parseInt(bufferedReader.readLine());

        distance = new int[n+1];
        visited = new int[n+1];
        edgeList = new List[n+1];
        for(int i =1; i<=n; i++)
        {
            edgeList[i] = new ArrayList<>();
            distance[i] = 1000000000;
        }

        String inputStr[];
        for(int i =0; i<m; i++)
        {
            inputStr = bufferedReader.readLine().split(" ");
            int start = Integer.parseInt(inputStr[0]);
            int end = Integer.parseInt(inputStr[1]);
            int cost = Integer.parseInt(inputStr[2]);
            edgeList[start].add(new Edge(end,cost));
        }
        inputStr = bufferedReader.readLine().split(" ");
        startP = Integer.parseInt(inputStr[0]);
        endP = Integer.parseInt(inputStr[1]);

        distance[startP] = 0;
        
//        priorityQueue.offer();

        for(int i=0; i<n-1; i++)
        {
            int min =1000000001;
            int x=-1;
            for(int j=1; j<=n; j++)
            {
                if(visited[j]==0 && min>distance[j])
                {
                    min = distance[j];
                    x=j;
                }
            }
            visited[x] = 1;
            for(Edge e: edgeList[x])
            {
                if(distance[e.end]>distance[x]+e.cost)
                {
                    distance[e.end] = distance[x]+e.cost;
                }
            }
        }

        for(int i =1; i<=n; i++)
        {
            if(distance[i] == 1000000000)
                System.out.println("INF");
            else
            System.out.println(distance[i]);
        }
    }
    static class Edge{

        int end,cost;
        public Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }
}