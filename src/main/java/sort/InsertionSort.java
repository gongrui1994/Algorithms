package sort;

/**
 * Created by gongrui on 2017/6/17.
 */
public class InsertionSort {

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //大二学的
    public static void sort2(int[] a) {
        for(int i=0;i<a.length;i++) {
            int j=i;
            while(j>0 && a[j-1] > a[j]) {
                swap(a,j-1,j);
                j--;
            }
        }
    }

    //算法导论
    public static void sort(int[] a) {
        for(int j=0;j<a.length;j++) {
            int key = a[j];
            int i=j-1;
            while(i>=0 && a[i] > key) {
                a[i+1] = a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        sort2(a);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
