package sort.linear;

/**
 * 桶排序
 * 建最大数个桶
 * Created by gongrui on 2017/6/25.
 */
public class BucketSort {

    public static void bucketSort(int[] a, int max) {
        int[] bucket = new int[max+1];
        for(int i=0;i<bucket.length;i++) {
            bucket[i]=0;
        }
        for(int i=0;i<a.length;i++) {
            bucket[a[i]]++;
        }
        int n=0;
        for(int i=0;i<bucket.length;) {
            if(bucket[i] > 0) {
                a[n] = i;
                n++;
                bucket[i]--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 3, 1 ,4 ,3 ,2 ,1, 5 ,2, 2, 4, 5, 1, 3, 4, 1, 3, 2, 2};
        bucketSort(a,5);
        for(int e:a) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
