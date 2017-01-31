package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 希尔排序
 * 均时间:O(nlogn) 最差时间:O(n的s方, 1<s<2) 稳定度:不稳定 额外空间:O(1)
 * s是所选分组
 * Created by panxiaoming on 17/1/31.
 */
public class ShellSort {

    public static void sort(List<Integer> list, int n) {
        int d, i, j, temp;
        //d为增量
        //增量递减到1使完成排序
        for(d=n/2; d>=1; d=d/2) {
            //插入排序的一轮
            for(i=d; i<n; i++) {
                temp = list.get(i);
                for(j=i-d; j>=0&&list.get(j)>temp; j=j-d) {
                    list.set(j+d, list.get(j));
                }
                list.set(j+d, temp);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-3);
        list.add(192);
        list.add(10);
        list.add(123);
        sort(list, list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
