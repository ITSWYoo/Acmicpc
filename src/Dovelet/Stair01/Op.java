package Dovelet.Stair01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Op {
    public static void main(String args[]) throws IOException {
        int a,b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = bufferedReader.readLine().split(" ");
        a = Integer.parseInt(inputStr[0]);
        b = Integer.parseInt(inputStr[1]);

        System.out.printf("%d+%d=%d\n",a,b,a+b);
        System.out.printf("%d-%d=%d\n",a,b,a-b);
        System.out.printf("%d*%d=%d\n",a,b,a*b);
        System.out.printf("%d/%d=%d\n",a,b,a/b);
        System.out.println(a+"%"+b+"="+a%b);
    }
}
