package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gongrui on 2017/8/22.
 */

class Idea {
    int id;
    int pm_no;
    int come_time;
    int priority;
    int need_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPm_no() {
        return pm_no;
    }

    public void setPm_no(int pm_no) {
        this.pm_no = pm_no;
    }

    public int getCome_time() {
        return come_time;
    }

    public void setCome_time(int come_time) {
        this.come_time = come_time;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getNeed_time() {
        return need_time;
    }

    public void setNeed_time(int need_time) {
        this.need_time = need_time;
    }
}

public class JRTT2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pm=0;
        int coder=0;
        int count=0;

        Idea[] list;
        while(in.hasNextInt()) {
            pm = in.nextInt();
            coder = in.nextInt();
            count = in.nextInt();
            list = new Idea[count];
            int n=0;
            for(int i=0;i<count;i++) {
                Idea idea = new Idea();
                idea.setId(n);
                idea.setPm_no(in.nextInt());
                idea.setCome_time(in.nextInt());
                idea.setPriority(in.nextInt());
                idea.setNeed_time(in.nextInt());
                list[i] = idea;
                n++;
            }
            //计算
        }
    }
}
