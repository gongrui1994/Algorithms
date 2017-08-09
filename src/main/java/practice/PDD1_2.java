package practice;

import java.util.Scanner;

/**
 * 错误，累加错误，从第四次开始出错
 * 原因是累加的时候忘记最后一次进位了
 * Created by gongrui on 2017/8/1.
 */
public class PDD1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1="";
        String s2="";
        while(in.hasNext()) {
            s1 = in.next();
            s2 = in.next();
            //System.out.println(s1);
            //System.out.println(s2);
            //保存中间结果
            String[] ss = new String[s1.length()];
            for(int i=s1.length()-1;i>=0;i--) {
                String temp="";
                int upper=0;
                for(int j=s2.length()-1;j>=0;j--) {
                    int a = Integer.parseInt(s1.substring(i,i+1));
                    int b = Integer.parseInt(s2.substring(j,j+1));
                    int c=a*b+upper;
                    //System.out.println("c="+c);
                    String s = c+"";
                    if(s.length() > 1) {
                        upper = Integer.parseInt(s.substring(0,1));
                        s = s.substring(1,2);
                    } else {
                        upper = 0;
                    }

                    if(temp.equals("")) {
                        temp = s;
                    } else {
                        temp = s+temp;
                    }
                    if(j==0) {
                        if(upper != 0) {
                            temp=upper+temp;
                        }
                    }
                    int m = s1.length()-i-1;
                    ss[m] = temp;
                    //System.out.println(temp);
                }
            }
            for(int i=0;i<ss.length;i++) {
                //System.out.println("temp="+ss[i]);
            }
            for(int i=1;i<ss.length;i++) {
                for(int j=0;j<i;j++) {
                    ss[i] += "0";
                }
            }
            for(int i=0;i<ss.length;i++) {
                //System.out.println("temp="+ss[i]);
            }
            //组装完毕，累加
            String res = ss[0];
            //System.out.println(res);
            for(int i=1;i<ss.length;i++) {
                int len1 = res.length();
                int len2 = ss[i].length();
                int k=1;
                String temp="";
                int upper = 0;
                while(len1-k >=0 && len2-k >= 0) {
                    int a = Integer.parseInt(res.substring(len1-k,len1-k+1));
                    int b = Integer.parseInt(ss[i].substring(len2-k,len2-k+1));
                    //System.out.println("a="+a);
                    //System.out.println("b="+b);
                    int c=a+b+upper;
                    //System.out.println("c="+c);
                    String s = c+"";
                    if(s.length() > 1) {
                        upper = Integer.parseInt(s.substring(0,1));
                        s = s.substring(1,2);
                    } else {
                        upper = 0;
                    }
                    temp = s + temp;
                    k++;
                }
                if(len1>len2) {
                    int a = Integer.valueOf(res.substring(0,len1-len2))+upper;
                    temp = a+temp;
                } else if(len1<len2){
                    int a = Integer.valueOf(ss[i].substring(0,len2-len1))+upper;
                    temp = a+temp;
                } else {
                    if(upper>0) {
                        temp = upper+temp;
                    }
                }
                //temp = ss[i].substring(0,1) + temp;
                res = temp;
                //System.out.println(res);
            }
            System.out.println(res);
            //输入982161082972751393 72106547548473106236
            //正确结果70820244829634538040848656466105986748
        }
    }
}
/**
 * 测试用例
 *
 */