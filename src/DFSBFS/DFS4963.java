package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-05.
 */
//https://www.acmicpc.net/problem/4963
public class DFS4963 {
    static int map[][];
    static int w,h;
    static int dy[] = {0,-1,-1,-1,0,1,1,1};
    static int dx[] = {-1,-1,0,1,1,1,0,-1};
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String s[] = bufferedReader.readLine().split(" ");
            w = Integer.parseInt(s[0]);
            h = Integer.parseInt(s[1]);
            map = new int[h+1][w+1];
            if(w==0 && h==0) return;
            for(int i = 1; i<=h; i++)
            {
                s = bufferedReader.readLine().split(" ");
                for(int j =1; j<=w ; j++)
                {
                    map[i][j] = Integer.parseInt(s[j-1]);
                }
            }

            int result = 0;
            for(int i =1; i<=h; i++)
            {
                for(int j =1; j<=w ; j++)
                {
                    if(map[i][j]==1 && map[i][j] !=-1)
                    {
                        dfs(i,j);
                        result ++;
                    }
                }
            }
            System.out.println(result);
        }
    }
    public static void dfs(int y, int x)
    {
        map[y][x] = -1;
        for(int i=0 ; i<8; i++)
        {
            int my = y+dy[i];
            int mx = x+dx[i];
            if(my<1||my>h||mx<1||mx>w) continue;
            if(map[my][mx]==1 && map[my][mx] !=-1)
                dfs(my,mx);
        }
    }
}
