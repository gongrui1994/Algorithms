package sort.advance;

/**
 * 快速排序另一种实现
 * 挖坑填数
 * Created by gongrui on 2017/6/19.
 */
public class QuickSort2 {

    public static void quickSort(int[] a, int l, int r) {
        if(l < r) {
            int i=l;
            int j=r;
            int x=a[i];
            while(i<j) {
                while(i<j && a[j] >= x) {
                    j--;
                }
                if(i<j) {
                    a[i] = a[j];
                    i++;
                }

                while(i<j && a[i] < x) {
                    i++;
                }
                if(i<j) {
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = x;
            quickSort(a,l,i-1);
            quickSort(a,i+1,r);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,8,7,1,3,5,6,4};
        quickSort(a,0,a.length-1);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
