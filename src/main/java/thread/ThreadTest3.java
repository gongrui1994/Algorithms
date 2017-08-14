package thread;

/**
 * 同步代码块
 * 共享数据
 * Created by gongrui on 2017/8/14.
 */
public class ThreadTest3 implements Runnable{
    public static void main(String[] args) {
        Runnable r = new ThreadTest2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

    public void run() {
        synchronized (this) {
            for(int i=0;i<10;i++) {
                System.out.println(i+" ");
            }
        }
    }
}
