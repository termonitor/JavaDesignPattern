package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 冒泡排序
 * 平均时间:O(n2) 最差时间:O(n2) 稳定度:稳定 额外空间:O(1)
 * n小的时候效率较高
 * Created by panxiaoming on 17/1/30.
 */
public class BubbleSort {

    public static void sort(List<Integer> list, int n) {
        int i, j, lastSwap, tmp;
        for(j=n-1; j>0; j=lastSwap) {
            lastSwap = 0;
            for(i=0; i<j; i++) {
                if(list.get(i) > list.get(i+1)) {
                    tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                    lastSwap = i;
                }
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
