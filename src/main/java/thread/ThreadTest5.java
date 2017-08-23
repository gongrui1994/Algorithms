package thread;

/**
 * Created by gongrui on 2017/8/20.
 */
public class ThreadTest5 implements Runnable{
    public void run() {
        synchronized(this){
            for(int i=0;i<10;i++) {
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new ThreadTest5();
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
