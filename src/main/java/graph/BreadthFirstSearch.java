package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 * Created by gongrui on 2017/7/2.
 */
public class BreadthFirstSearch {

    public static void search(int[][] graph, int[] v, boolean[] isChoosed, int i) {
        Queue<Integer> queue = new LinkedList<Integer>();
        isChoosed[i] = true;
        System.out.println(v[i]);
        queue.offer(i);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int j=0;j<v.length;j++) {
                if(!isChoosed[v[j]]) {
                    if(graph[node][j] == 1) {
                        isChoosed[j] = true;
                        System.out.println(v[j]);
                        queue.offer(v[j]);
                    }
                }
            }
        }
    }

    public static void breadthFirstSearch(int[][] graph, int[] v) {
        //标识位
        boolean[] isChoosed = new boolean[v.length];
        for(int i=0;i<v.length;i++) {
            if(!isChoosed[v[i]]) {
                search(graph,v,isChoosed,i);
            }
        }
    }

    public static void main(String[] args) {
        //邻接矩阵表示无向图
        //1表示两点之间有边，0表示无边
        int[][] graph = {{0,0,1,1,0,1,0},
                {0,0,1,0,0,0,0},
                {1,1,0,1,0,0,0},
                {1,0,1,0,0,0,0},
                {0,0,0,0,0,0,1},
                {1,0,0,0,0,0,1},
                {0,0,0,0,1,1,0}};
        //v是点的编号
        int[] v = {0,1,2,3,4,5,6};
        breadthFirstSearch(graph,v);
    }
}
