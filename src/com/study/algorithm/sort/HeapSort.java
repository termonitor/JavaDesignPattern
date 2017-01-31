package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆排序
 * 平均时间:O(nlogn) 最差时间:O(nlogn) 稳定度:不稳定 额外空间:O(1)
 * n大的时候效率较高
 * Created by panxiaoming on 17/1/31.
 */
public class HeapSort {

    public static void heapAdjust(List<Integer> list, int i, int nLength) {
        int nChild;
        int nTemp;
        for(nTemp=list.get(i); 2*i+1<nLength; i=nChild) {
            //子节点位置 = 2*父节点位置+1
            nChild = 2*i+1;
            //获取子节点中较大的节点
            if(nChild < nLength-1 && list.get(nChild+1) > list.get(nChild)) {
                nChild++;
            }
            //如果较大的子节点大于父节点,那么把子节点往上移动,替换它的父节点
            if(nTemp < list.get(nChild)) {
                list.set(i, list.get(nChild));
                list.set(nChild, nTemp);
            }
            else
                break;
        }
    }

    public static void sort(List<Integer> list, int length) {
        int tmp;
        //调整序列的前半部分元素，调整完之后第一个元素是序列的最大的元素
        //length/2-1是第一个非叶节点，此处"/"为整除
        for(int i=length/2-1; i>=0; i--) {
            heapAdjust(list, i, length);
        }
        //从最后一个元素开始对序列进行调整，不断的缩小调整的范围直到第一个元素
        for(int i=length-1; i>0; i--) {
            //把第一个元素和当前的最后一个元素交换，
            //保证当前的最后一个位置的元素都是在现在的这个序列之中最大的
            tmp = list.get(i);
            list.set(i, list.get(0));
            list.set(0, tmp);
            //不断缩小调整heap的范围，每一次调整完毕保证第一个元素是当前序列的最大值
            heapAdjust(list, 0, i);
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
