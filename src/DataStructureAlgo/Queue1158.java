package DataStructureAlgo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
public class Queue1158 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                int a = queue.poll();
                if (j == m - 1) {
                    arr[i] =  a;
                } else
                    queue.add(a);
            }
        System.out.print("<");
        for(int i =0 ; i<arr.length; i++)
        {
            if(i!=arr.length-1)
            {
                System.out.print(arr[i]+",");
            }
            else
                System.out.print(arr[i]);
        }
        System.out.print(">");
    }
}
