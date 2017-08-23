package practice;

import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/22.
 */
public class JRTT2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        while(in.hasNextInt()) {
            n = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            int p = 0;
            int q = 0;
            for(int i=0;i<2*n;i++) {
                if(i % 2 == 0) {
                    x[p] = in.nextInt();
                    p++;
                } else {
                    y[q] = in.nextInt();
                    q++;
                }
            }
            /*for(int e:x) {
                System.out.println(e);
            }
            for(int e:y) {
                System.out.println(e);
            }*/
            boolean[] flag = new boolean[n];
            for(int i=0;i<n;i++) {
                flag[i] = true;
            }
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(j!=i && flag[j]) {
                        if(x[j] > x[i] && y[j] > y[i]) {
                            flag[i] = false;
                            break;
                        }
                    }
                }
            }
            for(int i=0;i<n;i++) {
                if(flag[i]) {
                    System.out.println(x[i]+" "+y[i]);
                }
            }
        }
    }
}
