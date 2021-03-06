package sort.advance;

/**
 * 快速排序
 * 算法导论
 * Created by gongrui on 2017/6/18.
 */
public class QuickSort {

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //算法导论
    public static int partition(int[] a,int p,int r) {
        int x = a[r];//比较基准
        int i=p-1;
        for(int j=p;j<r;j++) {
            if(a[j] <= x) {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,r);
        return i+1;
    }

    public static void quickSort(int[] a,int p,int r) {
        if(p<r) {
            int q = partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,r);
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
