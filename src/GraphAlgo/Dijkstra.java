package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-12.
 */
public class Dijkstra {
    static int n,m;
    static int map[][];
    static int visited[];
    static int distance[];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(inputStr[0]);
        map = new int[n+1][n+1];
        visited = new int[n+1];
        distance = new int[n+1];
        m = Integer.parseInt(inputStr[1]);

        for(int i=1; i<=n; i++)
        {
            distance[i] =Integer.MAX_VALUE;
        }
        for(int i=0; i<m; i++)
        {
            inputStr = bufferedReader.readLine().split(" ");
            map[Integer.parseInt(inputStr[0])][Integer.parseInt(inputStr[1])] = Integer.parseInt(inputStr[2]);
        }

        FuncDijkstra(1,5);
    }
    public static void FuncDijkstra(int start,int end){
        distance[start] = 0;
        String s ="";
        for(int i =1; i<=n; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = 0;

        }
    }
}
