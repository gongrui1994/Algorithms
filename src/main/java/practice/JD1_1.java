package practice;

import java.util.Scanner;

/**
 * 输入：
 5
 1 2 4 5 3
 * Created by gongrui on 2017/8/1.
 */
public class JD1_1 {

    public static void getCount(int[] a) {
        int n = a.length;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int[] a=null;
        while(in.hasNextInt()) {
            n = in.nextInt();
            a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            getCount(a);
        }
    }
}
