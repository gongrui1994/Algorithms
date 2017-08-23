package sort.advance;

/**
 * 堆排序
 * 使用最大堆
 * 得到递增排序的数组，从小到大
 * Created by gongrui on 2017/6/18.
 */
public class HeapSort {

    public static final int INFINITY = 50000;

    public static void swap(int[] a,int i,int j) {
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //最大堆平衡
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

    //建立一个最大堆
    public static void buildMaxHeap(int[] a) {
        n = a.length-1;
        heapSize = n;
        //对每个子树执行最大堆平衡
        for(int i=n/2;i>=1;i--) {
            maxHeapify(a,i);
        }
    }

    public static void heapSort(int[] a) {
        //建立最大堆
        buildMaxHeap(a);
        //从最后一个数开始，将最大堆的根节点与它交换，得到递增排序的数组
        for(int i=n;i>=2;i--) {
            swap(a,1,i);
            heapSize--;
            //给剩下的堆执行最大堆平衡操作
            maxHeapify(a,1);
        }
    }

    public static int heapSize;
    public static int n;//n为需要排序数组的真实长度,下标从1开始到a.length-1，所以n=a.length-1
    public static void main(String[] args) {
        //堆排序数组下标从1开始比较好，包括求子儿子，以及求父节点，如果是从0开始，求父节点会出错
        int[] a = {INFINITY,2,8,7,1,3,5,6,4};
        heapSort(a);
        for(int e:a) {
            System.out.println(e);
        }
    }
}
