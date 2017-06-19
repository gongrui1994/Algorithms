package sort.advance;

/**
 * 归并排序
 * Created by gongrui on 2017/6/19.
 */
public class MergeSort {

    //合并
    public static void merge(int[] a, int p, int q, int r) {
        int n1 = q-p+1;
        int n2 = r-q;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i=0;i<n1;i++) {
            a1[i] = a[p+i];
        }
        for(int i=0;i<n2;i++) {
            a2[i] = a[q+1+i];
        }
        int i=0;//小于n1
        int j=0;//小于n2
        for(int k=p;k<=r;) {
            if(i<n1 && j<n2) {
                if (a1[i] <= a2[j]) {
                    a[k] = a1[i];
                    i++;
                    k++;
                } else {
                    a[k] = a2[j];
                    j++;
                    k++;
                }
            } else {
                if(i<n1) {
                    a[k] = a1[i];
                    i++;
                    k++;
                }
                if(j<n2) {
                    a[k] = a2[j];
                    j++;
                    k++;
                }
            }
        }
        for(int e:a) {
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] a, int p, int r) {
        if(p<r) {
            int q=(p+r)/2;
            mergeSort(a,p,q);
            mergeSort(a,q+1,r);
            merge(a,p,q,r);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,8,7,1,3,5,6,4};
        int n = a.length;
        System.out.println("中间过程：");
        mergeSort(a,0,n-1);
        System.out.println("最终结果：");
        for(int e:a) {
            System.out.print(e+" ");
        }
    }
}
