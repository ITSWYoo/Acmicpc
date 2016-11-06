package GraphAlgo;

import java.io.*;
import java.util.*;


public class Graph1854 {
    static int N, M, K;
    static List<Edge>[] adjList;
    static PriorityQueue<Integer>[] dist;

    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("src/Kth_SortestPath.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int T = Integer.parseInt(br.readLine().trim());
        //System.out.println(T);
        //for( int test_case=1 ; test_case<=T ; test_case++ ){
        String[] line1 = br.readLine().split(" ");
        N = Integer.parseInt(line1[0]);
        M = Integer.parseInt(line1[1]);
        K = Integer.parseInt(line1[2]);
        //System.out.println(N +" "+ M +" "+ K);

        adjList = new ArrayList[N+1];
        dist = new PriorityQueue[N+1];

        for( int i=0 ; i<=N ; i++){
            adjList[i] = new ArrayList<Edge>();
            dist[i] = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
        }


        String[] line2 = null;
        for(int i=1 ; i<=M ; i++){
            line2 = br.readLine().split(" ");
            int s = Integer.parseInt(line2[0]);
            int e = Integer.parseInt(line2[1]);
            int c = Integer.parseInt(line2[2]);
            //System.out.println(s +" "+ e +" "+ c);
            adjList[s].add(new Edge(e, c));
            //adjList[e].add(new Edge(s, c));
        }

//          for( int i=0 ; i<=N ; i++){
//              System.out.print(i + " : " );
//              for( int j=0 ; j<adjList[i].size() ; j++){
//                  System.out.print("(" + adjList[i].get(j).end + " " + adjList[i].get(j).dist + ")");
//              }
//              System.out.println();
//          }

        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        pq.add(new Edge(1, 0));
        dist[1].add(0);


        while( !pq.isEmpty() ){
            int curLocation = pq.peek().end;
            int curCost = pq.peek().dist;
            pq.poll();

            if( curCost > dist[curLocation].peek() ) continue;
            List<Edge> list = adjList[curLocation];
            for( Edge e : list ){
                int nextLocation = e.end;
                int cost = curCost + e.dist;
                if( dist[nextLocation].size() < K ){
                    dist[nextLocation].add(cost);
                    pq.add(new Edge(nextLocation, (int)cost));
                }else if( dist[nextLocation].size() >= K && dist[nextLocation].peek() > cost ){
                    dist[nextLocation].add(cost);
                    pq.add(new Edge(nextLocation, (int)cost));
                    dist[nextLocation].poll();
                }
            }
        }

        for( int i=1 ; i<=N ; i++ ){

            if( dist[i].size() < K ){
                //System.out.println("#" + test_case + " " + -1);
                System.out.println("-1");
            }
            else{
                //System.out.println("#" + test_case + " " + dist[N].peek());
                System.out.println(dist[i].peek());
            }
        }
        //}//test_case
    }//main



    static class Edge implements Comparable<Edge>{
        int end;
        int dist;
        public Edge(){}
        public Edge (int e, int d){
            this.end = e;
            this.dist = d;
        }
        @Override
        public int compareTo(Edge o) {
            return (dist > o.dist) ? 1 : -1;
        }
    }
}//class