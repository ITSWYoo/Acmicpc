package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yoo on 2016-10-06.
 */
//https://www.acmicpc.net/problem/1654
public class BS1654 {
    static int k, n;
    static List<Long> line;
    static long max;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        k = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);

        line = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            line.add(Long.parseLong(bufferedReader.readLine()));
        }
        Collections.sort(line);
        long result = 0;
        long left = 1;
        long right = line.get(line.size() - 1);
        long mid = 0;

        while (left <= right)
        {
            result = 0;
            mid = (left + right) / 2;
            for (Long l : line) {
                result += l / mid;
            }
            if (result >= n) {
                if (max < mid) {
                    max = mid;
                }
                left = mid + 1;
            } else if (result < n) {
                right = mid - 1;
            }
        }
        System.out.println(max);
    }
}