package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速排序
 * 平均时间:O(nlogn) 最差时间:O(n2) 稳定度:不稳定 额外空间:O(nlogn)
 * n大的时候效率较高
 * Created by panxiaoming on 17/1/30.
 */
public class QuickSort {

    public static int mpartition(List<Integer> list, int l, int r) {
        int pivot = list.get(l);

        while(l < r) {
            while(l<r && pivot<=list.get(r))
                r--;
            if(l < r)
                list.set(l++, list.get(r));
            while(l<r && pivot>list.get(l))
                l++;
            if(l < r)
                list.set(r--, list.get(l));
        }
        list.set(l, pivot);
        return l;
    }

    public static void sort(List<Integer> list, int l, int r) {
        if(l < r) {
            int q = mpartition(list, l, r);
            sort(list, l, q-1);
            sort(list, q+1, r);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-3);
        list.add(192);
        list.add(10);
        list.add(123);
        sort(list, 0, list.size()-1);
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
