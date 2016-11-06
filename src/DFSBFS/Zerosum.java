package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Yoo on 2016-10-15.
 */
public class Zerosum {
    static int num;
    static int nArrayCount = 0;
    static String[] arT = new String[10000];

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bufferedReader.readLine());
        dfs(2, "+", "1");
        dfs(2, "-", "1");
        dfs(2, " ", "1");

        Arrays.sort(arT, 0, nArrayCount);
        for (int i = 0; i < nArrayCount; i++) {
            System.out.println(arT[i]);
        }
    }

    static void dfs(int n, String op, String s) {
        s = new String(s + op + (n));

        if (n == num) {
            int nValue = 0;
            int nTotal = 0;
            int nOpr = 1;
            int nSize = s.length();
            int nCount = 0;
            while (nSize > nCount) {
                if ('+' == s.charAt(nCount)) {
                    if (nOpr == 1)
                        nTotal += nValue;
                    else
                        nTotal -= nValue;
                    nOpr = 1;
                    nValue = 0;
                } else if ('-' == s.charAt(nCount)) {
                    if (nOpr == 1)
                        nTotal += nValue;
                    else
                        nTotal -= nValue;
                    nOpr = 2;
                    nValue = 0;
                } else if (' ' == s.charAt(nCount))
                    nValue = nValue * 10;
                else {
                    if (nValue < 10)
                        nValue = (s.charAt(nCount) - 48);
                    else
                        nValue += (s.charAt(nCount) - 48);
                }
                nCount++;
            }

            if (nOpr == 1)
                nTotal += nValue;
            else
                nTotal -= nValue;

            if (nTotal == 0) {
                arT[nArrayCount++] = s;
            }
            return;
        }
        dfs(n+1, "+", s);
        dfs(n+1, "-", s);
        dfs(n+1, " ", s);
    }
}
