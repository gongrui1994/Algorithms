package practice;

import java.util.Scanner;

/**
 * 最优解
 * 分治法：最大矩形面积只可能有三种情况：
 1. 取决于高度最小的柱子，此时面积等于高度乘总长度；
 2. 最大面积出现在高度最小的柱子左边；
 3. 最大面积出现在高度最小的柱子右边；
 * Created by gongrui on 2017/8/23.
 */
public class MT1_3_2 {
    public static long area(int[] a, int l, int r) {
        if(l < r) {
            int minIndex=l;
            int minH=a[l];
            for(int i=l;i<=r;i++) {
                if(a[i] < minH) {
                    minIndex = i;
                    minH = a[i];
                }
            }
            long area1 = area(a,l,minIndex-1);
            long area2 = area(a,minIndex+1,r);
            long area3 = minH*((r-l)+1);
            if(area1 >= area2 && area1 >= area3) {
                return area1;
            } else if(area2 >= area1 && area2 >= area3) {
                return area2;
            } else if(area3 >= area1 && area3 >= area2) {
                return area3;
            } else {

            }
        } else if(l == r) {
            return a[l];
        } else {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int[] a;
        while(in.hasNextInt()) {
            n = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(area(a,0,n-1));;
        }
    }
}
