package graph;

/**
 * 深度优先搜索
 * 用邻接矩阵表示图
 * Created by gongrui on 2017/7/2.
 */
public class DepthFirstSearch {

    public static void search(int[][] graph, int[] v, boolean[] isChoosed, int i) {
        isChoosed[i] = true;
        System.out.println(v[i]);
        for(int j=0;j<v.length;j++) {
            if(graph[i][j] == 1 && !isChoosed[j]) {
                search(graph,v,isChoosed,j);
            }
        }
    }

    public static void depthFirstSearch(int[][] graph, int[] v) {
        //全为false
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
        depthFirstSearch(graph,v);
    }
}
