package string;

/**
 * 朴素字符串匹配算法
 * 预处理时间 0 匹配时间 O((n-m+1)m)
 * 时间复杂度O((n-m+1)m)
 * Created by gongrui on 2017/6/26.
 */
public class NaiveStringMatcher {

    /**
     * 朴素匹配
     * 一共有n-m+1种可能
     * @param t 文本
     * @param p 模式
     * @return
     */
    public static void matcher(String t, String p) {
        for(int i=0;i<t.length()-p.length()+1;i++) {
            if(p.equals(t.substring(i,i+p.length()))) {
                System.out.println("偏移s="+i);
            }
        }
    }

    public static void main(String[] args) {
        String t = "acaabcaabac";
        String p = "aab";
        matcher(t, p);
    }
}
