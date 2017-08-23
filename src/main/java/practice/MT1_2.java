package practice;

import java.util.Scanner;

/**
 * 动态规划
 * dp问题
 * 只用纸币1的情况下维护dp数组
 * 加上纸币5的情况下，即可以使用1和5纸币，维护dp数组
 * 继续可以使用1 5 10
 * 1 5 10 20
 * 1 5 10 20 50
 * 1 5 10 20 100
 * Created by gongrui on 2017/8/23.
 */
public class MT1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int[] money = {1,5,10,20,50,100};
        while(in.hasNextInt()) {
            n = in.nextInt();
            //dp下标从1开始，因为要用到money[]中的面值信息作为dp数组的下标
            long[] dp = new long[n+1];
            dp[0]=1;
            for(int i=0;i<6;i++) {
                for(int j=money[i];j<=n;j++) {
                    dp[j] = dp[j] + dp[j-money[i]];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
