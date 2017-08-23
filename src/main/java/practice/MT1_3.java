package practice;

import java.util.Scanner;

/**
 * dp解法，内存超限
 * Created by gongrui on 2017/8/23.
 */
public class MT1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int[] a;
        while(in.hasNextInt()) {
            n = in.nextInt();
            a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            //求区间内最低高度
            int[][] lowestH = new int[n][n];
            for(int i=0;i<n;i++) {
                lowestH[i][i] = a[i];
            }
            for(int k=1;k<n;k++) {
                for(int i=0;i<n-1;i++) {
                    for(int j=i+k;j<n;j++) {
                        if(lowestH[i][j-1] > lowestH[i+1][j]) {
                            lowestH[i][j] = lowestH[i+1][j];
                        } else {
                            lowestH[i][j] = lowestH[i][j-1];
                        }
                    }
                }
            }
            /*for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    System.out.print(lowestH[i][j]+" ");
                }
                System.out.println();
            }*/
            long[][] dp = new long[n][n];
            for(int i=0;i<n;i++) {
                dp[i][i] = a[i];
            }
            for(int k=1;k<n;k++) {
                for(int i=0;i<n-1;i++) {
                    for(int j=i+k;j<n;j++) {
                        long area;
                        if(dp[i][j-1] > dp[i+1][j]) {
                            //dp[i][j] = dp[i][j-1];
                            area = dp[i][j-1];
                            if((j-i+1)* lowestH[i][j]> area) {
                                area = (j-i+1)*lowestH[i][j];
                            }
                        } else {
                            //dp[i][j] = dp[i+1][j];
                            area = dp[i+1][j];
                            if((j-i+1)*lowestH[i][j] > area) {
                                area = (j-i+1)*lowestH[i][j];
                            }
                        }
                        dp[i][j] = area;
                    }
                }
            }
            /*for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }*/
            System.out.println(dp[0][n-1]);
        }
    }
}
