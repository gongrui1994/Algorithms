package sort.linear;

/**
 * 基数排序
 * 为了保证基数排序算法的正确性
 * 一位数排序算法必须是稳定的（稳定的意思是经过排序，具有相同关键字的记录其相对次序保持不变）
 * Created by gongrui on 2017/6/20.
 */
public class RadixSort {

    /**
     * 拿到x的个位 十位 百位上的数
     * @param x
     * @param k 1表示个位 2表示10位..以此类推
     * @return 相应位置上的数，没有返回0
     */
    public static int getFigure(int x, int k) {
        String s = x+"";
        int figure;
        if(k <= s.length()) {
            figure = Integer.parseInt(s.substring(s.length()-k,s.length()-k+1));
        } else {
            figure=0;
        }
        return figure;
    }

    public static void radixSort(int[] a) {
        //新建10个桶
        //每个桶最多10个数，这个不好控制，最大为a得长度
        int[][] temp = new int[10][10];
        //新建桶长度记录数组
        int[] len = new int[10];
        //从个位到10位到百位
        //一共设置了3位，这个不好控制，得通过拿到最大数的位数来确定，此处没做
        for(int k=1;k<=3;k++) {
            //还原桶长度
            for(int i=0;i<10;i++) {
                len[i] = 0;
            }
            //分配
            for(int i=0;i<a.length;i++) {
                temp[getFigure(a[i],k)][len[getFigure(a[i],k)]] = a[i];
                len[getFigure(a[i],k)]++;
            }
            /*for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
                    System.out.print(temp[i][j]+" ");
                }
                System.out.println();
            }*/
            //收集
            int n=0;
            for(int i=0;i<10;i++) {
                for(int j=0;j<len[i];j++) {
                    a[n] = temp[i][j];
                    n++;
                }
            }
            /*for(int e:a) {
                System.out.print(e+" ");
            }
            System.out.println();*/
        }
    }

    public static void main(String[] args) {
        int[] a = {521, 310, 72, 373, 15, 546, 385, 856, 187, 147};
        radixSort(a);//+1的目的是增加数组长度 使之能存放0-8的出现次数
        for(int e:a) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
