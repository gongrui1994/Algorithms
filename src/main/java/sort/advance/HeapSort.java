package sort.advance;

/**
 * 最大堆
 * 递增排序，从小到大
 * Created by gongrui on 2017/6/18.
 */
public class HeapSort {

    public static final int INFINITY = 50000;

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void maxHeapify(int[] a,int i) {
        int l=i*2;
        int r=i*2+1;
        int largest;
        if(l<=heapSize && a[l] > a[i]) {
            largest=l;
        }else {
            largest=i;
        }
        if(r<=heapSize && a[r] > a[largest]) {
            largest=r;
        }
        if(largest != i) {
            swap(a,i,largest);
            maxHeapify(a,largest);
        }
    }

    public static void buildMaxHeap(int[] a) {
        n = a.length-1;
        heapSize = n;
        for(int i=n/2;i>=1;i--) {
            maxHeapify(a,i);
        }
    }

    public static void heapSort(int[] a) {
        buildMaxHeap(a);
        for(int i=n;i>=2;i--) {
            swap(a,1,i);
            heapSize--;
            maxHeapify(a,1);
        }
    }

    public static int heapSize;
    public static int n;//n为需要排序数组的真实长度,下标从1开始到a.length-1，所以n=a.length-1
    public static void main(String[] args) {
        int[] a = {INFINITY,2,8,7,1,3,5,6,4};
        heapSort(a);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
