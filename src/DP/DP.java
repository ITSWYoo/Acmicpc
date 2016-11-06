package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-15.
 */
public class DP {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int a = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[n];
        int b = Integer.parseInt(bufferedReader.readLine());
        String s[]= bufferedReader.readLine().split(" ");
        for(int i =0; i<n; i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        int dp[][] = new int[n][2];
        for(int i=0; i<n; i++){
            int ab=0, bb=0;
            int tmp = arr[i];
            //부감독관으로 이루어진 명수
            if(tmp % b == 0){
                bb = tmp/b;
            }else{
                bb = tmp/b+1;
            }
            //총감독관이 포함된 명수
            if(a >= tmp){
                ab = 1;
            }else{
                tmp -= a;
                if(tmp % b == 0){
                    ab = tmp/b;
                }else{
                    ab = tmp/b+1;
                }
                ab+=1;//총감독관 포함시키기
            }

            //dp[i][0]총감독관 포함x dp[i][1]총감독관 포함o
            if(i==0){
                dp[i][0] = bb;
                dp[i][1] = ab;
            }else{
                dp[i][0] = dp[i-1][0] + bb;
                dp[i][1] = Math.min(dp[i-1][0] + ab, dp[i-1][1] + bb);
            }
        }
        System.out.println(dp[n-1][1]);
    }
}
