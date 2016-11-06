package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GuGu {
    public static void main(String[] args) {
        String[] words = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            words = line.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }


        int result=0;
        for (String word : words) {
            result += word.length();
        }

        System.out.println(result);
        // write your code here



    }
}