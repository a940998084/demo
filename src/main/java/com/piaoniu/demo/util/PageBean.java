package com.piaoniu.demo.util;

import java.util.List;

/**
 * 分页工具类
 * @param <T>
 */
public class PageBean<T> {
    private List<T> list;           //存放实体类数据
    private Integer pageNo=1;       //当前页码数（默认给1）
    private Integer pageSize=15;    //每页显示的行数
    private Integer totalPage;      //总页数
    private Integer totalRows;      //总行数
    private int pageStartRow;       //每页的起始数
    private int pageEndRow;         //每页显示数据的终止数
    private boolean hasNextPage=false;    //是否有下一页
    private boolean hasPreviousPage=false; //是否有前一页



    public PageBean(List<T> list,int pageSize){
        init(list,pageSize);
    }
    /**
     * 初始化list，并告知该list每页的记录数
     * @param list 数据集合
     * @param pageSize  一页显示多少数据
     */
    public void init(List<T> list,int pageSize){
        this.pageSize=pageSize;
        this.list=list;
        totalRows=list.size();
        hasPreviousPage=false;
        totalPage=totalRows%pageSize==0?totalRows/pageSize:(totalRows/pageSize+1);
        if (pageNo>=totalPage){
            hasNextPage=false;
        }else {
            hasNextPage=true;
        }
        if (totalRows<pageSize){
            this.pageStartRow=0;
            this.pageEndRow=totalRows;
        }else {
            this.pageStartRow=0;
            this.pageEndRow=pageSize;
        }
    }

    /**
     * 判断是否分页
     * @return
     */
    public boolean isNext(){
        return list.size()>15;
    }


    public String toString(int temp){
        String str=Integer.toString(temp);
        return str;
    }
    public void description(){
        String description="共有数据数："+this.getTotalRows()+
                "共有页数："+this.getTotalPage()+
                "当前页数为："+this.getPageNo()+
                "是否有下一页："+this.isHasNextPage()+
                "是否有前一页："+this.isHasPreviousPage()+
                "开始行数："+this.getPageStartRow()+
                "终止行数："+this.getPageEndRow();
        System.out.println(description);
    }

    /**
     * 处理分页
     */
    public void disposePage(){
        if (pageNo==0){
            pageNo=1;
        }
        if ((pageNo-1)>0){
            hasPreviousPage=true;
        }else {
            hasPreviousPage=false;
        }

        if (pageNo>totalPage){
            hasNextPage=false;
        }else {
            hasNextPage=true;
        }
    }

    /**
     * 获取第几页的内容
     * @param pageNo 当前页数
     * @return
     */
    public List<T> getObjects(int pageNo){
        if (pageNo==0){
            this.setPageNo(1);
        }else {
            this.setPageNo(pageNo);
        }
        this.disposePage();
        if (pageNo*pageSize<totalRows){
            //判断是否为最后一页
            pageEndRow=pageNo*pageSize;
            pageStartRow=pageEndRow-pageSize;
        }else {
            pageEndRow=totalRows;
            pageStartRow=pageSize*(totalPage-1);
        }
        List<T> objects=null;
        if (!list.isEmpty()){
            objects=list.subList(pageStartRow,pageEndRow);
        }
        return objects;
    }

    /**
     * 获取下一页内容
     * @return
     */
    public List getNextPage(){
        pageNo=pageNo+1;
        disposePage();
        System.out.println("用户调用的是第"+pageNo+"页");
        this.description();
        return getObjects(pageNo);
    }

    /**
     * 获取前一页内容
     * @return
     */
    public List getPreviousPage(){
        pageNo=pageNo-1;
        if ((pageNo-1)>0){
            hasPreviousPage=true;
        }else {
            hasPreviousPage=false;
        }
        if (pageNo>=totalPage){
            hasNextPage=false;
        }else {
            hasNextPage=true;
        }
        this.description();
        return this.getObjects(pageNo);
    }
    public List<T> getList() {
        return list;
    }

    public List<T> getFirstPage(){
        if (this.isNext()){
            return list.subList(0,pageSize);
        }else {
            return list;
        }
    }
    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public int getPageStartRow() {
        return pageStartRow;
    }

    public void setPageStartRow(int pageStartRow) {
        this.pageStartRow = pageStartRow;
    }

    public int getPageEndRow() {
        return pageEndRow;
    }

    public void setPageEndRow(int pageEndRow) {
        this.pageEndRow = pageEndRow;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }
}
