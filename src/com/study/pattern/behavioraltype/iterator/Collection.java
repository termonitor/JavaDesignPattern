package com.study.pattern.behavioraltype.iterator;

/**
 * Created by panxiaoming on 17/1/27.
 */
public interface Collection {

    public Iterator iterator();

    //取得集合元素
    public Object get(int i);

    //取得集合大小
    public int size();
}
