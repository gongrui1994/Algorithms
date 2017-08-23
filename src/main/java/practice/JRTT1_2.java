package practice;

import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/1.
 */
public class JRTT1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        if(in.hasNextInt()) {
            n = in.nextInt();
        }
        int m=0;
        if(in.hasNextInt()) {
            m = in.nextInt();
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            if(in.hasNextInt()) {
                a[i] = in.nextInt();
            }
        }
        //开始计算
        int count=0;
        int[][] b = new int[n][n];
        //初始化
        for(int i=n-2;i>=0;i--) {
            int j=i+1;
            b[i][j] = a[i]^a[j];
            if(b[i][j] > m) {
                count++;
            }
        }
        //迭代
        for(int k=3;k<=n;k++) {//k 3 4
            for (int i = n - k; i >= 0; i--) {
                int j = i + (k - 1);
                b[i][j] = b[i][j - 1] ^ b[j - 1][j];
                if (b[i][j] > m) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
