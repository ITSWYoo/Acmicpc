package CodeGround;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-10.
 */
public class Chess {
    static int caseNum;
    static int n,m,k;
    static int map[][];
    static int dy[] ={0,1};
    static int dx[] ={1,0};
    static int result =0;
    static Queue<Point> queue;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        caseNum = Integer.parseInt(bufferedReader.readLine());

        for(int i =1 ; i<=caseNum ; i++)
        {
            result =0;
            queue = new LinkedList<>();
            String inputStr[] = bufferedReader.readLine().split(" ");
            n = Integer.parseInt(inputStr[0]);
            m = Integer.parseInt(inputStr[1]);
            k = Integer.parseInt(inputStr[2]);

            map = new int[10001][10001];
            for(int j=1; j<=k; j++)
            {
                String blockStr[] = bufferedReader.readLine().split(" ");
                map[Integer.parseInt(blockStr[0])][Integer.parseInt(blockStr[1])] = 1;
            }
            Point start = new Point(1,1);
            queue.add(start);
            bfs();
            System.out.println("Case #"+i);
            System.out.println(result);
        }
    }
    public static void bfs(){
        while(!queue.isEmpty())
        {
            Point popPoint = queue.poll();
            if(popPoint.y==n&& popPoint.x==m) {
                result = result%1000000007 +1;
            }
            for(int i=0; i<2; i++)
            {
                int my,mx;
                my = popPoint.y +dy[i];
                mx = popPoint.x +dx[i];
                if(my<0|| mx<0 || my>n || mx>m) continue;
                if(map[my][mx]!=1) {
                    System.out.println(my+","+mx);
                    queue.add(new Point(my, mx));
                }
            }
        }
    }
    public static class Point{
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}