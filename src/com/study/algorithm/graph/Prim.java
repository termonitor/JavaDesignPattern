package com.study.algorithm.graph;

/**
 * Prim算法
 * 最小生成树
 * Created by panxiaoming on 17/1/31.
 */
public class Prim {

    public static void prim(int n, float[][] c) {
        float[] lowcost = new float[n+1];
        //最小代价
        lowcost[n] = Float.MAX_VALUE-1000;
        int[] closest = new int[n+1];
        closest[n] = (int)lowcost[n];
        //邻接节点的数组
        boolean[] s = new boolean[n+1];
        //判断在不在s中，即有没有在已连接的图中
        s[1] = true;
        for(int i=2; i<n-1; i++) {
            lowcost[i] = c[1][i];
            closest[i] = 1;
            s[i] = false;
        }
        for(int i=1; i<n-1; i++) {
            float min = Float.MAX_VALUE;
            int j = 1;
            for(int k=2; k<=n-1; k++) {
                if(lowcost[k]<min && !s[k]) {
                    min = lowcost[k];
                    j = k;
                }
            }
            System.out.println(j+","+closest[j]);
            s[j] = true;
            for(int k=2; k<=n-1; k++) {
                if(c[j][k]<lowcost[k] && !s[k]) {
                    lowcost[k] = c[j][k];
                    closest[k] = j;
                }
            }
        }
    }

    public static void main(String[] args) {
        float s = Float.MAX_VALUE-1000;
        float[][] c = {{s,s,s,s,s,s,s},
                {s,s,6,1,5,s,s},
                {s,6,s,5,s,3,s},
                {s,1,5,s,5,6,4},
                {s,5,s,5,s,s,2},
                {s,s,s,6,s,s,6},
                {s,s,s,4,2,6,s}};
        prim(7, c);
    }
}
