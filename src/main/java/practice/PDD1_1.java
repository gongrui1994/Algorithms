package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 正确的牛客网输入
 * 没有考虑到负负得正的情况
 * 最大的乘积会出现在最大的三个数相乘或者最大的数和最小的两个负数相乘
 * Created by gongrui on 2017/8/1.
 */
public class PDD1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        long[] a=null;
        while(in.hasNextInt()) {
            n = in.nextInt();
            a = new long[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            //开始计算
            Arrays.sort(a);
            System.out.println(Math.max(a[0]*a[1]*a[n-1],a[n-1]*a[n-2]*a[n-3]));
        }
    }
}
