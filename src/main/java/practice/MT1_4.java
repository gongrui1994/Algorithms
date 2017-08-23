package practice;

import java.util.Scanner;

/**
 * Xi,Yj表示长度为0-i的s1子串和长度为0-j的s2子串的连续子串的长度
 * dp[i][j]表示到s1的第i个字符和s2的第j个字符时，连续子串的长度
 * 对于abcde和abgde
 * 创建长度为[n+1][n+1]的二位数组
 * 维护的dp数组为
 * 0 0 0 0 0 0
 * 0 1 0 0 0 0
 * 0 0 2 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 1 0
 * 0 0 0 0 0 2
 * Created by gongrui on 2017/8/23.
 */
public class MT1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1;
        String s2;
        while(in.hasNextLine()) {
            s1 = in.nextLine();
            s2 = in.nextLine();
            int res=0;
            int[][] dp = new int[s1.length()+1][s2.length()+1];
            for(int i=1;i<=s1.length();i++) {
                for(int j=1;j<=s2.length();j++) {
                    if(s1.substring(i-1,i).equals(s2.substring(j-1,j))) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                        res = Math.max(dp[i][j],res);
                    } else {
                        dp[i][j] = 0;//因为子串需要连续，所以不一样的话就置为0
                    }
                }
            }
            System.out.println(res);
        }
    }
}
