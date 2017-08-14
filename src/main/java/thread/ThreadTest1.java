package thread;

/**
 * 同步方法
 * 非共享变量
 * 打印结果无法预知
 * Created by gongrui on 2017/8/14.
 */
public class ThreadTest1 implements Runnable{
    public static void main(String[] args) {
        Runnable r1 = new ThreadTest1();
        Runnable r2 = new ThreadTest1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

    public synchronized void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i+" ");
        }
    }
}
