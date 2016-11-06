package GraphAlgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 위상정렬
// https://www.acmicpc.net/problem/2623

public class Graph1516 {

    static int N, M;
    static int[] indegree = new int[1001];
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 출연 가수 수 1, 2, ..., N <= 1000
        M = sc.nextInt(); // 보조 PD 수 M <= 100

        // 1~N 가수 생성
        for (int i = 0; i < N + 1; i++) {

            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int prev = 0;
            int current = 0;
            int num = sc.nextInt();

            prev = sc.nextInt();
            for (int j = 0; j < num - 1; j++) {

                current = sc.nextInt();

                indegree[current]++;
                adjList.get(prev).add(current);
                prev = current;
            }
        }

        // System.out.println(adjList);
        // System.out.println(Arrays.toString(indegree));

        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> result = new LinkedList<Integer>();

        for (int i = 1; i < N + 1; i++) {
            if (indegree[i] == 0) {

                q.offer(i);
            }
        }

        while (!q.isEmpty()) {

            int v = q.poll();
            result.offer(v); // 저장소에 저장
            System.out.println(v+"!!!!!!!");
            for (int adjV : adjList.get(v)) {
                System.out.println(adjV+"@@@@@@");
                indegree[adjV]--;
                if (indegree[adjV] == 0) {
                    System.out.println(adjV+"gggggg");
                    q.offer(adjV);
                }
            }
        }

        for(int n: indegree)
        {
            if(n>0) {
                System.out.println(0);
                return;
            }
        }
        while (!result.isEmpty()) {
            System.out.println(result.poll());
        }

        sc.close();
    }

}