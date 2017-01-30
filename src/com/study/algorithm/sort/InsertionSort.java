package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 插入排序
 * 平均时间:O(n2) 最差时间:O(n2) 稳定度:稳定 额外空间:O(1)
 * 大部分已排序时效率较高
 * Created by panxiaoming on 17/1/30.
 */
public class InsertionSort {

    public static void sort(List<Integer> list, int n) {
        int i, j, v;
        for(i=1; i<n; i++) {
            //如果第i个元素小于第i-1个元素,则将第i-1个元素向后移动
            for(v=list.get(i), j=i-1; j>=0&&v<list.get(j); j--) {
                list.set(j+1, list.get(j));
            }
            list.set(j+1, v);
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
