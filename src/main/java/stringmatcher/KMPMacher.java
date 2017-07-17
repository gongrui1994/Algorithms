package stringmatcher;

/**
 * Created by gongrui on 2017/7/1.
 */
public class KMPMacher {

    /**
     * 计算前缀函数π
     * P="ababaca"
     * π={0,0,1,2,3,0,1}
     * @param P
     * @return π
     */
    public static int[] computingFrefixFunction(String P) {
        int m=P.length();
        int[] π=new int[m];
        int k=0;
        for(int q=1;q<m;q++) {
            while(k>0 && !P.substring(k,k+1).equals(P.substring(q,q+1))) {
                k=π[k];
            }
            if(P.substring(k,k+1).equals(P.substring(q,q+1))) {
                k++;
            }
            π[q] = k;//k的值写到π中
            //System.out.println("k="+k);
        }
        return π;
    }

    /**
     * KMP字符串匹配
     * @param T
     * @param P
     */
    public static void matcher(String T, String P) {
        int n=T.length();
        int m=P.length();
        int[] π=computingFrefixFunction(P);
        int q=0;
        for(int i=0;i<n;i++) {
            while (q > 0 && !P.substring(q, q+1).equals(T.substring(i, i + 1))) {
                // 为什么q=π[q-1]
                // q会在匹配成功后+1.如果用q=π[q]将会取到实际值的后一位
                // 所以取q=π[q-1]即可
                q = π[q-1];//next character does not match
                System.out.println("new q="+q);
            }
            System.out.println("q="+q+" i="+i);
            if (P.substring(q, q+1).equals(T.substring(i, i + 1))) {
                q++;//next character matches
            }
            //System.out.println("q="+q+" P.sub="+P.substring(q, q + 1)+" i="+i);
            if(q == m) {//is all of P matched?
                System.out.println("偏移s="+(i-m+1));
                q=π[q-1];//look for the next match
            }
        }
    }

    public static void main(String[] args) {
        String T = "bacbabababacaab";
        String P = "ababaca";
        matcher(T,P);
    }
}
