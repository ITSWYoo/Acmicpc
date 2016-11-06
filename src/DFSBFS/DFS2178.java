package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-06.
 */
//https://www.acmicpc.net/problem/2178
public class DFS2178 {
    static int map[][];
    static int n,m;
    static int dy[] ={-1,0,1,0};
    static int dx[] ={0,-1,0,1};
    static Queue<Point> queue;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(inputStr[0]);
        m = Integer.parseInt(inputStr[1]);
        map = new int[n+1][m+1];
        for(int i =1; i<=n; i++)
        {
            String s = bufferedReader.readLine();
            for(int j =1; j<=m; j++)
            {
                map[i][j]= Character.getNumericValue(s.charAt(j-1));
            }
        }
        queue = new LinkedList<>();
        Point start = new Point(1,1);
        queue.add(start);
        bfs();
    }
    public static void bfs(){
        while(!queue.isEmpty())
        {
            Point popPoint = queue.poll();
            if(popPoint.y==n && popPoint.x==m) {
                System.out.println(map[popPoint.y][popPoint.x]);
            }
            int min = map[popPoint.y][popPoint.x];
            map[popPoint.y][popPoint.x]=-1;
            for(int i=0; i<4; i++)
            {
                int my = popPoint.y+dy[i];
                int mx = popPoint.x+dx[i];
                if(my<1||mx<1||my>n||mx>m) continue;
                if(map[my][mx] ==1) {
                    queue.add(new Point(my, mx));
                    map[my][mx]= min+1;
                }
            }
        }
    }
    static class Point{
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
