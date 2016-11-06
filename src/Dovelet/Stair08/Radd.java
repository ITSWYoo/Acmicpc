package Dovelet.Stair08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Radd {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bufferedReader.readLine().split(" ");
        System.out.println(reverse(reverse(Integer.parseInt(s[0]))+reverse(Integer.parseInt(s[1]))));
    }
    public static int reverse(int n){
        int result=0;
        while(n>0)
        {
            result*=10;
            result += n%10;
            n/=10;
        }
        return result;
    }
}
