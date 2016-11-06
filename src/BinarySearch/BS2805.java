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
public class BS2805 {
    static int n, m;
    static List<Long> line;
    static long max;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        line = new ArrayList<>();
        s = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            line.add(Long.parseLong(s[i]));
        }
        Collections.sort(line);

        long left =1;
        long right = line.get(line.size()-1);
        long mid;
        long result;
        long max =0;
        while(left<=right)
        {
            result = 0;
            mid = (left+right)/2;
            for(long l: line)
            {
                if(l>mid) result += (l -mid);
            }
            if(m>result)
            {
                right = mid-1;
            }
            else if(m<result){
                if(max<mid)
                    max = mid;
                left =mid+1;
            }
            else break;
        }
        System.out.println(max);
    }
}
