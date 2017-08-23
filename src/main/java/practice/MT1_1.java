package practice;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/23.
 */
public class MT1_1 {

    int[] a = {1,2,3,4,5,6};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        while(in.hasNextInt()) {
            n = in.nextInt();
            System.out.println((int)Math.pow(2,n-1));
        }
    }
}
