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
public class Graph2887 {
    static int n;
    static List<Edge> vertex[];
    static List<Edge> map;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n= Integer.parseInt(bufferedReader.readLine());
        vertex= new List[n+1];
        for(int i=1; i<=n; i++)
        {
            vertex[i]= new ArrayList<>();
            String s[] = bufferedReader.readLine().split(" ");
            Edge edge = new Edge(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            map.add(edge);
        }
        for(int i=1; i<=n; i++)
        {
        }
        PriorityQueue<Edge> queue = new PriorityQueue<>(1, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Integer.compare(o1.cost,o2.cost);
            }
        });

    }
    static class Edge{
        int start,end,cost;

        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
}

