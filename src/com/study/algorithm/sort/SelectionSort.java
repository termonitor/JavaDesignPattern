package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择排序
 * 平均时间:O(n2) 最差时间:O(n2) 稳定度:不稳定 额外空间:O(1)
 * n小的时候效率较高
 * Created by panxiaoming on 17/1/30.
 */
public class SelectionSort {

    public static void sort(List<Integer> list, int n) {
        int i, j, pos, tmp;
        for(i=0; i<n-1; i++) {
            for(pos=i, j=i+1; j<n; j++) {
                if(list.get(pos) > list.get(j))
                    pos = j;
            }
            if(pos != i) {
                tmp = list.get(i);
                list.set(i, list.get(pos));
                list.set(pos, tmp);
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
