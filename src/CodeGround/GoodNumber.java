//package CodeGround;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Created by Yoo on 2016-10-10.
// */
//public class GoodNumber {
//    static int caseNum;
//    static int n;
//    static int m[];
//    static int dp[] = new int[200000];
//    public static void main(String args[]) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        caseNum = Integer.parseInt(bufferedReader.readLine());
//        for(int i =1; i<=caseNum; i++)
//        {
//            n= Integer.parseInt(bufferedReader.readLine());
//            m= new int[n+1];
//            String s[] =bufferedReader.readLine().split(" ");
//
//            for(int j=1; j<=n; j++)
//            {
//                m[j] = Integer.parseInt(s[j-1]);
//            }
//            int result = 0;
//
//            for(int j=2; j<=n; j++)
//            {
//                for(int k = 1; k<j; k++)
//                {
//                    int Stair01 = m[j-1]+m[k];
//                    dp[Stair01] =1;
//                }
//                for(int z = 1; z<j; z++)
//                {
//                    if(m[j]-Stair01 == m[z]) result++;
//                }
//            }
//            System.out.println("Case #"+i);
//            System.out.println(result);
//        }
//    }
//}
