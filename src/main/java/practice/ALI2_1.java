package practice;

import java.util.Scanner;

/**
 * 最长递增子序列
 * Created by gongrui on 2017/8/21.
 */
public class ALI2_1 {
    static int pick(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i] >= a[j]) {
                    b[i]++;
                }
            }
        }
        int max = b[0];
        for(int i=1;i<n;i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}
