package stringmatcher;

/**
 * Rabin-Karp算法
 * 字符集为a-z
 * 字符串转为整形数 时间复杂度为O(m)
 * 当模相同时，需要比较字符串，可能会存在伪命中点
 * Created by gongrui on 2017/6/26.
 */
public class RabinKarpMatcher {

    /**
     * Rabin-Karp算法
     * @param T 文本
     * @param P 模式
     * @param d 基数
     * @param q 素数
     */
    public static void matcher(String T, String P, int d, int q) {
        int n = T.length();
        int m = P.length();
        //System.out.println("n-m="+(n-m));
        int h = 1;
        //h为d的m-1次方mod q
        h=((int) Math.pow(d,m-1)) % q;
        //System.out.println("h="+h);
        int p = 0;
        int t = 0;
        //预处理，计算p,t
        for(int i=0;i<m;i++) {
            p = (d*p + (P.charAt(i) - 'a')) % q;
            t = (d*t + (T.charAt(i) - 'a')) % q;
        }
        //System.out.println("p="+p);
        //System.out.println("t="+t);
        for (int s = 0; s <= n-m; s++) {
            if (p == t) {
                //如果求余后相等，那么就逐个字符比较
                if(T.substring(s,s+m).equals(P)) {
                    System.out.println("偏移s="+s);
                }
            }
            if (s < n-m) {
                t = (d*(t-(T.charAt(s) - 'a')*h) + T.charAt(s+m) - 'a') % q;
                if (t < 0) {
                    t += q;
                }
                //System.out.println("t="+t);
            }
        }
    }

    public static void main(String[] args) {
        String t = "acaabcaabac";
        String p = "aab";
        //26个字符a-z，29为素数
        matcher(t, p,26, 29);
    }
}
