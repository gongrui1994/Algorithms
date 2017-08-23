/*

import java.util.Arrays;
import java.util.Scanner;

*/
/**
 * Created by gongrui on 2017/8/22.
 *//*

public class Main {
    static int[] d = null;
    static Element[] g = null;
    static int[] L = null;
    static int[] R = null;
    static int[] P = null;
    static int[] Q = null;
    static long[] sum = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        d = new int[n+2];
        sum = new long[n+2];
        L = new int[n+2];
        P = new int[n+2];
        Q = new int[n+2];
        R = new int[n+2];
        g = new Element[n+2];
        sum[0] = sum[n+1] = 0;
        for(int i=1;i<=n;i++) {
            d[i] = in.nextInt();
            sum[i] = d[i];
            L[i] = 0;
            R[i] = n+1;
            g[i] = new Element(d[i],i);
            P[i] = Q[i] = i;
        }
        Arrays.sort(g,1,n+1);
        long ans = 0;
        for(int i=1;i<=n;i++) {
            int index = g[i].index;
            long t = sum[L[index]] + sum[R[index]]+ sum[index];
            if(t*d[index] > ans) {
                ans = t*d[index];
            }
            int p,q;
            if(L[index>0]) {
                p = P[L[index]];
            } else {
                p = index;
            }
            if(R[index]<n+1) {

            }



        }
    }
}
*/
