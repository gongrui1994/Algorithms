package sort.linear;

/**
 * 计数排序
 * Created by gongrui on 2017/6/20.
 */
public class CountingSort {

    /**
     *
     * @param a
     * @param b
     * @param k 最小为a数组中最大数+1，c[i]表示i在a数组中出现的次数
     */
    public static void countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k+1];
        for(int i=0;i<c.length;i++) {
            c[i] = 0;
        }
        for(int i=0;i<a.length;i++) {
            c[a[i]]++;
        }
        //till here，c[i]代表i出现的次数
        for(int i=1;i<c.length;i++) {
            c[i] = c[i]+c[i-1];
        }
        //till here，c[i]表示小于或等于i的数的个数
        for(int i=0;i<a.length;i++) {
            b[c[a[i]]-1] = a[i];//c[a[i]]表示小于或等于a[i]的数的个数，所以在c[a[i]]-1的下标上放这个数
            c[a[i]]--;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,3,0,2,2,0,3};
        int[] b = new int[a.length];
        countingSort(a,b,5);//+1的目的是增加数组长度 使之能存放0-8的出现次数
        for(int e:b) {
            System.out.println(e);
        }
    }
}
