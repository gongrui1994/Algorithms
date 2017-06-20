package sort.basic;

/**
 * 希尔排序（缩小增量排序）
 * 关键在于gap的选择
 * Created by gongrui on 2017/6/19.
 */
public class ShellSort {

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        int n=a.length;
        int gap = n/2;
        while(gap >= 1) {
            for(int i=0;i<n;i+=gap) {
                for(int j=i+gap;j<n;j+=gap) {
                    if(a[j] < a[i]) {
                        swap(a,i,j);
                    }
                }
            }
            gap = gap/2;
            if(gap == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3,8,7,1,2,5,6,4};
        sort(a);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
