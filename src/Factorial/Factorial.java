package Factorial;

import java.util.Scanner;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Factorial {
    static int result = 1;

    public static void main(String args[]) {
        int input;

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        System.out.println(factorial(input));
        System.out.println("");
        System.out.println(recFactorial(input));
    }

    public static int factorial(int input) {
        if (input < 0) {
            System.out.println("입력이 잘못되었습니다.");
            return -1;
        }
        else if (input < 2) return result;
        else {
            for (int i = 2; i <= input; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static int recFactorial(int input){
        if(input >1) return input* recFactorial(input -1);
        else {
            return 1;
        }
    }
}
