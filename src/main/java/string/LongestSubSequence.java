package string;

import java.util.Map;
import java.util.Scanner;

/**
 * 最长公共子序列
 * dp[i][j]表示到s1的第i个字符和s2的第j个字符时，连续子串的长度
 * 对于abcde和abgde
 * 创建长度为[n+1][n+1]的二位数组
 * 维护的dp数组为
 * 0 0 0 0 0 0
 * 0 1 1 1 1 1
 * 0 1 2 2 2 2
 * 0 1 2 2 2 2
 * 0 1 2 2 3 3
 * 0 1 2 2 3 4
 * ap[s1.length()][s2.length()]为最优解
 * Created by gongrui on 2017/8/23.
 */
public class LongestSubSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1;
        String s2;
        while(in.hasNextLine()) {
            s1 = in.nextLine();
            s2 = in.nextLine();
            int[][] dp = new int[s1.length()+1][s2.length()+1];
            for(int i=1;i<=s1.length();i++) {
                for(int j=1;j<=s2.length();j++) {
                    if(s1.substring(i-1,i).equals(s2.substring(j-1,j))) {
                        dp[i][j] = dp[i-1][j-1]+1;
                    } else {
                        int max = Math.max(dp[i-1][j],dp[i][j-1]);
                        dp[i][j] = max;
                    }
                }
            }
            System.out.println(dp[s1.length()][s2.length()]);
        }
    }
}
