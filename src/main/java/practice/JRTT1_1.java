package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/1.
 */
public class JRTT1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        if(in.hasNextInt()) {
            n = in.nextInt();
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            if(in.hasNextInt()) {
                a[i] = in.nextInt();
            }
        }
        Arrays.sort(a);
        //开始计算
        int exam=1;
        int sum=0;
        for(int i=1;i<n;i++) {
            if(a[i]-a[i-1] <= 10) {
                exam++;
            } else if(a[i] - a[i-1] > 10 && a[i] - a[i-1] <= 20){
                exam+=2;
                sum++;
                i++;
            } else if(a[i] - a[i-1] > 20) {
                exam+=2;
                sum+=2;
            } else {

            }
            if(exam == 3) {
                exam = 1;
            }
        }
        sum = sum+(3-exam);
        System.out.println(sum);
    }
}
