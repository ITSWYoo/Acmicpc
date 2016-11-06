package CodeGround;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-10.
 */
public class Non {
    static int caseNum;
    static int n;
    static int map[];
    static int result[];
    static int cnt;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        caseNum = Integer.parseInt(bufferedReader.readLine());
        for(int j =1 ; j<=caseNum; j++) {
            n = Integer.parseInt(bufferedReader.readLine());
            map = new int[n];
            result = new int[n];

            String s[] = bufferedReader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                map[i] = Integer.parseInt(s[i]);
            }
            int f =0;
            while(cnt<n)
            {
                cnt = 2;
                for(int i =1 ; i<n-1; i++)
                {
                    if(map[i]== 1) {
                        result[i]=0;
                        cnt++;
                    }
                    else if(map[i]>1){
                        if(map[i-1]<map[i+1])
                        {
                            result[i]=map[i-1];
                            if(result[i]==0)
                                cnt++;
                        } else{
                            result[i] = map[i+1];
                            if(result[i]==0)
                                cnt++;
                        }
                    }
                    else cnt++;
                }
                f++;

                for(int i =0; i<n; i++)
                {
                    map[i] = result[i];
                }
            }
            System.out.println("Case #"+j);
            System.out.println(f);
        }
    }
}
