package GraphAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Yoo on 2016-10-12.
 */
public class Graph2056 {
    public static void main(String args[]) throws IOException {
        int n;
        int varArr[];
        List<Integer> integerList[];
        int visited[];
        Queue<Integer> queue;
        int result = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        varArr = new int[n + 1];
        integerList = new List[n + 1];
        visited = new int[n + 1];
        int d[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            integerList[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            String inputStr[] = bufferedReader.readLine().split(" ");
            varArr[i] = Integer.parseInt(inputStr[0]);
            for (int j = 2; j < inputStr.length; j++) {
                if (Integer.parseInt(inputStr[j]) != 0) {
                    integerList[Integer.parseInt(inputStr[j])].add(i);
                    visited[i]++;
                }
            }
        }
        queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                queue.add(i);
                d[i] = varArr[i];
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int num : integerList[x]) {
                visited[num]--;
                if (visited[num] == 0) {
                    queue.add(num);
                }
                if (d[num] < d[x] + varArr[num]) {
                    d[num] = d[x] + varArr[num];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (result < d[i])
                result = d[i];
        }
        System.out.println(result);
    }
}
