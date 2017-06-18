package sort.basic;

/**
 * Created by gongrui on 2017/6/18.
 */
public class SelectionSort {

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        int n=a.length;
        int lowIndex;
        int lowValue;
        for(int i=0;i<n;i++) {
            lowIndex=i;
            lowValue=a[i];
            for(int j=i;j<n;j++) {
                if(a[j] < lowValue) {
                    lowIndex = j;
                    lowValue = a[j];
                }
            }
            swap(a,i,lowIndex);
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
