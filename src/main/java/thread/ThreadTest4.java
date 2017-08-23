package thread;

/**
 * Created by gongrui on 2017/8/20.
 */

public class ThreadTest4 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        Thread t = new ThreadTest4();
        t.start();
    }
}
