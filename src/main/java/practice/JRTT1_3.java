package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/22.
 */
public class JRTT1_3 {

    public static int getNext(int n, int m, int x) {
        int y = x+1;
        String s = x+"";
        int temp = Integer.parseInt(s.substring(s.length()-2,s.length()-1));
        return y;
    }

    public static List buildTree(int n, int m) {
        List<Integer> list = new ArrayList<Integer>();
        int[] b = {0,1,2,3,4,5,6,7,8,9};
        String s = n+"";
        int len = s.length();

        list.add(1);
        for(int i=1;i<m;i++) {
            int x = getNext(n,m,list.get(i-1));
            list.add(x);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        while(in.hasNextInt()) {
            n = in.nextInt();
            m = in.nextInt();
            buildTree(n,m);
        }
    }
}
