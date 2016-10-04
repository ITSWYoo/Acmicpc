package DP;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-29.
 */
public class StairOneTwo {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(dp(input));
    }
    public static int dp(int input)
    {
        if(input ==1) return 1;
        else if(input ==2) return 2;
        else return dp(input-1)+ dp(input-2);
    }
}
