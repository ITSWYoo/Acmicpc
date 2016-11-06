package Dovelet.Stair08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Rev {
    public static void main(String args[])  {
        for(int i=10; i<=100000; i++)
        {
            int result = i+reverse(i);
            if(result == reverse(result))
            {
                System.out.println(i);
            }
        }
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
