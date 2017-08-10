package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 贪心
 * Created by gongrui on 2017/8/9.
 */
public class PDD1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=0;//h大小
        int[] h=null;
        int n2=0;//w大小
        int[] w=null;
        while(in.hasNextInt()) {
            n1 = in.nextInt();
            h = new int[n1];
            for(int i=0;i<n1;i++) {
                h[i] = in.nextInt();
            }
            n2 = in.nextInt();
            w = new int[n2];
            for(int i=0;i<n2;i++) {
                w[i] = in.nextInt();
            }
            //开始计算
            int m = n2-1;
            int count = 0;
            Arrays.sort(h);
            Arrays.sort(w);
            for(int i=n1-1;i>=0;i--) {
                if(m >= 0 && h[i] <= w[m]) {
                    count++;
                    m--;
                }
            }
            System.out.println(count);
        }
    }
}
