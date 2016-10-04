package Factorial;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Choose {
    Scanner scanner = new Scanner(System.in);
    int result = 0;
    public long choose(int n, int r)
    {
        if(r==0 || (n==r))return 1;
        else {
           return choose(n-1,r-1) + choose(n-1,r);
        }
    }
    public static void main(String args[]){
        System.out.println(new Choose().choose(30,10));
    }
}
