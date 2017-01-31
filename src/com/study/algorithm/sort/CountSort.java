package com.study.algorithm.sort;

import java.util.*;

/**
 * 计数排序
 * 平均时间:O(nlogn) 最差时间:O(nlogn) 稳定度:稳定
 * 计数排序适合数据分布集中的排序，如果数据太分散，会造成空间的大量浪费，假设数据为（1,2,3,1000000），
 * 这就需要1000000的额外空间，并且有大量的空间浪费和时间浪费。
 * Created by panxiaoming on 17/1/31.
 */
public class CountSort {

    /**
     * 计数排序的步骤：
     * 1. 找出待排序的数组中最大和最小的元素（计数数组C的长度为max-min+1，其中位置0存放min，依次填充到最后一个位置存放max）
     * 2. 统计数组中每个值为i的元素出现的次数，存入数组C的第i项
     * 3. 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）
     * 4. 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1（反向填充是为了保证稳定性）
     */

    public static Map findArrMaxMin(List<Integer> a, int size) {
        if(size == 0)
            return null;
        int min,max;
        min = a.get(0);
        max = a.get(0);
        if(size == 1) {
            Map map = new HashMap();
            map.put("max", max);
            map.put("min", min);
        }
        for(int i=1; i<size; i++) {
            int num = a.get(i);
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        Map map = new HashMap();
        map.put("max", max);
        map.put("min", min);
        return map;
    }

    public static void sort(List<Integer> a, List<Integer> b, int n) {
        Map result = findArrMaxMin(a, a.size());
        int max = (Integer)result.get("max");
        int min = (Integer)result.get("min");
        int numRange = max-min+1;
        List<Integer> counter = new ArrayList<Integer>(numRange);
        int i, j, k;
        for(k=0; k<numRange; k++)
            counter.add(0);
        for(i=0; i<n; i++) {
            int index = a.get(i)-min;
            counter.set(index, counter.get(index)+1);
        }
        for(k=1; k<numRange; k++) {
            int count = counter.get(k-1);
            counter.set(k, counter.get(k)+count);
        }
        for(j=n-1; j>=0; j--) {
            int v = a.get(j);
            int index = counter.get(v-min)-1;
            b.set(index, v);
            counter.set(v-min, index);
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
        sort(list, tmp, list.size());
        for(int i=0; i<tmp.size(); i++) {
            System.out.print(tmp.get(i)+" ");
        }
        System.out.println();
    }
}
