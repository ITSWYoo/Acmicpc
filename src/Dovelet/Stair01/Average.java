package Dovelet.Stair01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Average {
    public static void main(String args[]) throws IOException {
        int a,b,c,d;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        c = Integer.parseInt(s[2]);
        d = Integer.parseInt(s[3]);
        double result = (a+b+c+d)/4.0;
        System.out.printf("%.2f",result);
    }
}
