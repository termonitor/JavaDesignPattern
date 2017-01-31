package com.study.algorithm.search;

/**
 * 二分查找
 * Created by panxiaoming on 17/1/31.
 */
public class BinarySearch {

    public int search(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;
            if(a[mid] == key)
                return mid;
            if(a[mid] < key)
                high = mid-1;
            if(a[mid] > key)
                low = mid+1;
        }
        return -1;
    }
}
