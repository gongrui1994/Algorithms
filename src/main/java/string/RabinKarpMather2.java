package string;

/**
 * Created by gongrui on 2017/6/26.
 */
public class RabinKarpMather2 {

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
            p = (d*p + (P.charAt(i) - '0')) % q;
            t = (d*t + (T.charAt(i) - '0')) % q;
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
                t = (d*(t-(T.charAt(s) - '0')*h) + T.charAt(s+m) - '0') % q;
                if (t < 0) {
                    t += q;
                }
                //System.out.println("t="+t);
            }
        }
    }

    public static void main(String[] args) {
        String t = "13112311213";
        String p = "112";
        //10个字符0-9，29为素数
        matcher(t, p,10, 29);
    }
}
