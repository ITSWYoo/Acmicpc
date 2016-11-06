package Dovelet.Stair01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Area {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        System.out.println(Integer.parseInt(inputStr[0])*Integer.parseInt(inputStr[1]));
    }
}
