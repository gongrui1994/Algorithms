package array;

import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/21.
 */
public class LongestIncreaseSubSequence {
    static int pick(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            b[i]=1;
            for(int j=0;j<i;j++) {
                if(a[j] <= a[i]) {
                    b[i] = b[j]+1;
                }
            }
        }
        /*for(int i=0;i<n;i++) {
            System.out.println(b[i]+"");
        }
        System.out.println();*/
        int max = b[0];
        for(int e:b) {
            if(e>max) {
                max = e;
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
