package Dovelet.Stair01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class CtoF {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("%.1f",9.0/5.0*Integer.parseInt(bufferedReader.readLine())+32);
    }
}
