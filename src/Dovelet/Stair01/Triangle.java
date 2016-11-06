package Dovelet.Stair01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Triangle {
    public static void main(String args[]) throws IOException {
        int w,h;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        w = Integer.parseInt(s[0]);
        h = Integer.parseInt(s[1]);
        float result = w*h*0.5f;
        System.out.printf("%.2f",11.367/3.0);
    }
}
