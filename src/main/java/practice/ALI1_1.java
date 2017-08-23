package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by gongrui on 2017/8/15.
 */
public class ALI1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = new String[3];
        if(in.hasNextLine()) {
            s[0] = in.nextLine();
        }
        if(in.hasNextLine()) {
            s[1] = in.nextLine();
        }
        if(in.hasNextLine()) {
            s[2] = in.nextLine();
        }
        StringTokenizer t1 = new StringTokenizer(s[0],"-;");
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        int x=0;
        while(t1.hasMoreTokens()) {
            if(x % 2 == 0) {
                list1.add(t1.nextToken());
            } else {
                list2.add(t1.nextToken());
            }
            x++;
        }
        for(int i=0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }
        for(int i=0;i<list2.size();i++) {
            System.out.println(list2.get(i));
        }

        StringTokenizer t2 = new StringTokenizer(s[0],"-;");
    }
}
