package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 归并排序
 * 平均时间:O(nlogn) 最差时间:O(nlogn) 稳定度:稳定 额外空间:O(1)
 * n大的时候效率较高
 * Created by panxiaoming on 17/1/31.
 */
public class MergeSort {

    public static void mergeArray(List<Integer> list, int first, int mid, int last, List<Integer> tmp) {
        int i=first, j=mid+1;
        int m=mid, n=last;
        int k=0;
        while(i<=m && j<=n) {
            if(list.get(i) < list.get(j))
                tmp.set(k++, list.get(i++));
            else
                tmp.set(k++, list.get(j++));
        }
        while(i <= m)
            tmp.set(k++, list.get(i++));
        while(j <= n)
            tmp.set(k++, list.get(j++));
        for(i=0; i<k; i++) {
            list.set(first+i, tmp.get(i));
        }
    }

    public static void sort(List<Integer> list, int first, int last, List<Integer> tmp) {
        if(first < last) {
            int mid = (first+last)/2;
            //左边有序
            sort(list, first, mid, tmp);
            //右边有序
            sort(list, mid+1, last, tmp);
            //将两个有序数列合并
            mergeArray(list, first, mid, last, tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(1);
        list.add(-3);
        list.add(192);
        list.add(10);
        list.add(123);
        sort(list, 0, list.size()-1, tmp);
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
