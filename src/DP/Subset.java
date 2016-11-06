package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Subset {
    static int m,n;
    static int dp[];
    static int value[];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        m = Integer.parseInt(inputStr[0]);
        n = Integer.parseInt(inputStr[1]);
    }
}
