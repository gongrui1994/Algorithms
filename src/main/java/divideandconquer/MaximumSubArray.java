package divideandconquer;

import java.util.HashMap;
import java.util.Map;

/**
 * 最大子数组
 * Created by gongrui on 2017/7/2.
 */
public class MaximumSubArray {

    public static final int NEGATIVE_INFINITY = -50000;

    /**
     * 跨越中点的最大子数组
     * @param b
     * @param low
     * @param mid
     * @param high
     * @return leftIndex,rightIndex,sum
     */
    public static Map<String,Integer> finMaxCrossingSubArray(int[] b, int low, int mid, int high) {
        int sum=0;
        int leftSum=NEGATIVE_INFINITY;
        int leftIndex=mid;//初始化
        for(int i=mid;i>=low;i--) {
            sum += b[i];
            if(sum > leftSum) {
                leftSum = sum;
                leftIndex = i;
            }
        }
        sum = 0;
        int rightSum=NEGATIVE_INFINITY;
        int rightIndex=mid+1;//初始化
        for(int i=mid+1;i<=high;i++) {
            sum += b[i];
            if(sum > rightSum) {
                rightSum = sum;
                rightIndex = i;
            }
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("leftIndex",leftIndex);
        map.put("rightIndex",rightIndex);
        map.put("sum",leftSum+rightSum);
        return map;
    }

    /**
     * 分治法
     * 递归求解最大子数组
     * @param b
     * @param low
     * @param high
     * @return leftIndex,rightIndex,sum
     */
    public static Map<String, Integer> findMaxSubArray(int[] b, int low, int high) {
        if(low == high) {
            Map map = new HashMap<String, Integer>();
            map.put("leftIndex",low);
            map.put("rightIndex",high);
            map.put("sum",b[low]);
            return map;
        } else {
            int mid=(low+high)/2;
            Map leftMap = findMaxSubArray(b,low,mid);
            Map rightMap = findMaxSubArray(b,mid+1,high);
            Map crossingMap = finMaxCrossingSubArray(b,low,mid,high);
            int leftSum = (Integer) leftMap.get("sum");
            int rightSum = (Integer) rightMap.get("sum");
            int crossingSum = (Integer) crossingMap.get("sum");
            if(leftSum >= rightSum && leftSum >= crossingSum) {
                Map map = new HashMap<String, Integer>();
                map.put("leftIndex",low);
                map.put("rightIndex",mid);
                map.put("sum",leftSum);
                return map;
            } else if(rightSum >= leftSum && rightSum >= crossingSum) {
                Map map = new HashMap<String, Integer>();
                map.put("leftIndex",mid+1);
                map.put("rightIndex",high);
                map.put("sum",rightSum);
                return map;
            } else {
                return crossingMap;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        int[] b = new int[a.length];//第i天与第i-1天的价格差
        //数组下标从1开始，下标0无意义
        //b[i]表示第i天与第i-1天的差值，i从1开始
        for(int i=0;i<a.length;i++) {
            if(i==0) {
                b[i] = 0;
            } else {
                b[i] = a[i]-a[i-1];
            }
        }
        //下标从1开始
        Map map = findMaxSubArray(b,1,b.length-1);
        int low = (Integer) map.get("leftIndex");
        int high = (Integer) map.get("rightIndex");
        int sum = (Integer) map.get("sum");
        System.out.println("low="+low);
        System.out.println("high="+high);
        System.out.println("sum="+sum);
    }
}
