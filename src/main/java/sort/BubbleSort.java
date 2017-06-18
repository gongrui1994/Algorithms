package sort;

/**
 * Created by gongrui on 2017/6/18.
 */
public class BubbleSort {

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++) {
            for(int j=n-1;j>i;j--) {
                if(a[j] > a[j-1]) {
                    swap(a,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        sort(a);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
