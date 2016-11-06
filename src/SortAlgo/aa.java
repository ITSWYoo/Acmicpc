package SortAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-12.
 */
public class aa {
    public static void main(String args[]) throws IOException {
        int n, k;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] =bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        s = bufferedReader.readLine().split(" ");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i =0 ; i<s.length; i++)
        {
            queue.offer(Integer.parseInt(s[i]));
        }
        for(int i =0; i<k; i++)
        {
            int a =queue.poll();
            if(i==k-1) {
                System.out.println(a);
            }
        }
    }
}
