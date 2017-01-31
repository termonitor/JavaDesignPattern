package com.study.algorithm.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基数排序
 * 平均时间:O(logRB) 最差时间:O(logRB) 稳定度:稳定 额外空间:O(n)
 * B是真数(0-9),R是基数(个十百)
 * Created by panxiaoming on 17/1/31.
 */
public class RadixSort {

    /**
     * 基数排序的步骤：以整数为例，将整数按十进制位划分，从低位到高位执行以下过程。
     * 1. 从个位开始，根据0~9的值将数据分到10个桶桶，例如12会划分到2号桶中。
     * 2. 将0~9的10个桶中的数据顺序放回到数组中。
     * 重复上述过程，一直到最高位。
     * 上述方法称为LSD（Least significant digital），还可以从高位到低位，称为MSD。
     */

    //获得某个数字的第pos位的值
    public static int getNumInPos(int num, int pos) {
        int tmp = 1;
        for(int i=0; i<pos-1; i++)
            tmp *= 10;
        return (num/tmp) % 10;
    }

    public static void sort(List<Integer> pDataArray, int iDataNum) {
        Map<Integer, List> map = new HashMap<>();
        for(int i=0; i<10; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<iDataNum+1; j++)
                list.add(0);
            map.put(i, list);
        }
        //从个位开始
        for(int pos=1; pos<=5; pos++) {
            for(int i=0; i<iDataNum; i++) {
                int num = Math.abs(getNumInPos(pDataArray.get(i), pos));
                List<Integer> list = map.get(num);
                int index = list.get(0)+1;
                list.set(0, index);
                list.set(index, pDataArray.get(i));
            }
            for(int i=0, j=0; i<10; i++) {
                List<Integer> list = map.get(i);
                for(int k=1; k<=list.get(0); k++) {
                    pDataArray.set(j++, list.get(k));
                }
                list.set(0, 0);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
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
