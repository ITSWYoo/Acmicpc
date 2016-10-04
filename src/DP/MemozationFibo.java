package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
public class MemozationFibo {
    public static int memozation[];
    static int a;
    public static void main(String args[])
    {
        System.out.println(aa());
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        memozation= new int[input];

    }
    public static int aa(){
        return a=3;
    }
    public static int dp(int input)
    {
        if(memozation[input]>0) return memozation[input];
        else if(input <3) {
            return memozation[input] = 1;
        }
        else {
            return memozation[input] = dp(input-1) + dp(input-2);
        }
    }
}
