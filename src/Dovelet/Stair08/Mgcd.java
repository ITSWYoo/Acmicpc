package Dovelet.Stair08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yoo on 2016-10-11.
 */
public class Mgcd {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int numArr[] = new int[n];
        String inputStr[] = bufferedReader.readLine().split(" ");
        for(int i = 0 ; i<inputStr.length; i++)
        {
            numArr[i]=Integer.parseInt(inputStr[i]);
        }
        Arrays.sort(numArr);

        int cnt=numArr.length;
        int flag=0;
        int result=1;
        while(cnt!=numArr.length)
        {
            cnt = 0;
            for(int i=2; i<=numArr[numArr.length-1]; i++)
            {
                for(int a: numArr)
                {
                    if(a%i==0) cnt++;
                }
                if(cnt==numArr.length)
                {
                    result *=i;
                    return;
                }
            }
        }
        System.out.println(result);
    }
}
