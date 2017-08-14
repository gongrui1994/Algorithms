package thread;

/**
 * 同步方法
 * 共享数据
 * 打印结果一定每次都是0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
 * Created by gongrui on 2017/8/14.
 */
public class ThreadTest2 implements Runnable{
    public static void main(String[] args) {
        Runnable r = new ThreadTest2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

    public synchronized void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i+" ");
        }
    }
}
