package com.study.struct;

import java.io.Serializable;

/**
 * 分页算法
 * Created by panxiaoming on 17/3/3.
 */
public class Pageable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每页默认的项数(10)
     */
    public static final int DEFAULT_ITEMS_PER_PAGE = 10;

    /**
     * 滑动窗口默认的大小(7)
     */
    public static final int DEFAULT_SLIDER_SIZE = 7;

    /**
     * 表示项数未知(Integer.MAX_VALUE)
     */
    public static final int UNKNOWN_ITEMS = Integer.MAX_VALUE;

    /**
     * 状态量
     */
    private int page;       //当前页码
    private int items;      //总共项数
    private int itemsPerPage;       //每页项数
    private int startRow;       //开始条数
    private int endRow;     //结束条数

    /**
     * 创建一个分页器,初始项数为无限大,默认每页显示10项
     */
    public Pageable() {
        this(10);
    }

    /**
     * 创建一个分页器,初始项数为无限大,指定每页项数
     * @param itemsPerPage
     */
    public Pageable(int itemsPerPage) {
        this(itemsPerPage, UNKNOWN_ITEMS);
    }

    /**
     * 创建一个分页器,初始项数为无限大,指定每页项数
     * @param itemsPerPage
     * @param items
     */
    public Pageable(int itemsPerPage, int items) {
        this.items = (items>=0)?items:0;
        this.itemsPerPage = (itemsPerPage>0)?itemsPerPage:DEFAULT_ITEMS_PER_PAGE;
        this.page = calcPage(0);
    }

    /**
     * 取得总页数
     * @return
     */
    public int getPages() {
        if(items <= 0)
            return 1;
        return (int)Math.ceil((double)items/itemsPerPage);
    }

    /**
     * 取得当前页
     * @return
     */
    public int getPage() {
        return page;
    }

    /**
     * 设置并取得当前页
     * @param page
     * @return
     */
    public int setPage(int page) {
        return (this.page = calcPage(page));
    }

    /**
     * 取得总项数
     * @return
     */
    public int getItems() {
        return items;
    }

    /**
     * 设置并取得总项数。如果指定的总项数小于0,则被看作0
     * @param items
     * @return
     */
    public int setItems(int items) {
        this.items = (items>=0)?items:0;
        setPage(page);
        return this.items;
    }

    /**
     * 取得每页项数
     * @return
     */
    public int getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * 设置并取得每页项数。如果指定的每页项数小于等于0,则使用默认值DEFAULT_ITEMS_PER_PAGE
     * 并调整当前页使之在改变每页项数前后显示相同的项
     * @param itemsPerPage
     * @return
     */
    public int setItemsPerPage(int itemsPerPage) {
        int tmp = this.itemsPerPage;
        this.itemsPerPage = (itemsPerPage>0)?itemsPerPage:DEFAULT_ITEMS_PER_PAGE;
        if(page > 0)
            setPage((int)(((double)(page-1)*tmp)/this.itemsPerPage)+1);
        return this.itemsPerPage;
    }

    /**
     * 取得当前页的长度,即当前页的实际项数
     * @return
     */
    public int getLength() {
        if(page > 0)
            return Math.min(itemsPerPage*page, items) - (itemsPerPage*(page-1));
        else
            return 0;
    }

    /**
     * 计算页数,但不改变当前页
     * @param page
     * @return
     */
    protected int calcPage(int page) {
        int pages = getPages();
        if(pages > 0) {
            return (page < 1)?1:(page>pages?pages:page);
        }
        return 0;
    }

    /**
     * 取得首页页码
     * @return
     */
    public int getFirstPage() {
        return calcPage(1);
    }

    /**
     * 取得末页页码
     * @return
     */
    public int getLastPage() {
        return calcPage(getPages());
    }

    /**
     * 取得前一页页码
     * @return
     */
    public int getPreviousPage() {
        return calcPage(page - 1);
    }

    /**
     * 取得前n页页码
     * @param n
     * @return
     */
    public int getPreviousPage(int n) {
        return calcPage(page - n);
    }

    /**
     * 取得后一页页码
     * @return
     */
    public int getNextPage() {
        return calcPage(page+1);
    }

    /**
     * 取得后n页页码
     * @param n
     * @return
     */
    public int getNextPage(int n) {
        return calcPage(page + n);
    }

    /**
     * 判断指定页码是否被禁止,也就是说指定页码超出了范围或等于当前页码
     * @param page
     * @return
     */
    public boolean isDisabledPage(int page) {
        return ((page<1)||(page>getPages())||(page==this.page));
    }

    /**
     * 创建副本
     * @return
     */
    public Object clone() {
        try {
            return super.clone();
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * 设置开始条数
     * @param startRow
     */
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    /**
     * 设置结束条数
     * @param endRow
     */
    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    /**
     * 获得起始条数
     * @return
     */
    public int getStartRow() {
        if(page > 0)
            startRow = (page-1)*itemsPerPage + 1;
        else
            startRow = 0;
        return startRow;
    }

    /**
     * 获得结束条数
     * @return
     */
    public int getEndRow() {
        if(page > 0)
            endRow = Math.min(itemsPerPage*page, items);
        else
            endRow = 0;
        return endRow;
    }

}
