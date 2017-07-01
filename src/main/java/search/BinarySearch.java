package search;

/**
 * 二分查找
 * Created by gongrui on 2017/7/1.
 */
public class BinarySearch {

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(key == a[mid]) {
                return mid;
            } else if(key > a[mid]){
                low=mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] a, int low, int high, int key) {
        if(low <= high) {
            int mid = (low + high) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                low = mid + 1;
                return binarySearchRecursion(a, low, high, key);
            } else {
                high = mid - 1;
                return binarySearchRecursion(a, low, high, key);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i=0;i<a.length;i++) {
            a[i] = i;
        }
        int index = binarySearch(a, 32);
        System.out.println(index);
        int index2 = binarySearchRecursion(a,0,a.length-1,64);
        System.out.println(index2);
    }
}
