package sort.test;

import java.util.Arrays;

/**
 * 比较手写的快速排序和Array.sort方法速度
 * Created by gongrui on 2017/6/19.
 */
public class CompareQuickerSortWithArraysSort {

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
        long startTime=System.nanoTime();   //获取开始时间
        quickSort(a,0,a.length-1);
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("手写快排运行时间： "+(endTime-startTime)+"ns");

        int[] b = {2,8,7,1,3,5,6,4};
        startTime=System.nanoTime();   //获取开始时间
        Arrays.sort(b);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("Arrays.sort()运行时间： "+(endTime-startTime)+"ns");
    }
}
