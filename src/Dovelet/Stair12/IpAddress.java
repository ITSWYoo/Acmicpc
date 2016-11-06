package Dovelet.Stair12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yoo on 2016-10-11.
 */
public class IpAddress {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char s[] = bufferedReader.readLine().toCharArray();
        int ip[] = {128,64,32,16,8,4,2,1};
        int a;
        String result = "";
        for(int i=0; i<s.length/8; i++)
        {
            a =0;
            for(int j =i*8; j<(i+1)*8; j++)
            {
                if(s[j]=='1') {
                    a += ip[j % 8];
                }
            }
            result +=a;
            if(i!=3) {
                result += ".";
            }
        }
        System.out.println(result);
    }
}
