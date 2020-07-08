package ssmBook.service;

import ssmBook.pojo.Book;

import java.util.List;

/**
 * 书本service
 * 书本分类检索、名字搜索、获取列表等
 */
public class BookService {

    /**
     * 获取图书列表
     */
    public List<Book> getBookList()
    {
        return null;
    }

    /**
     * 通过名称搜索图书
     */
    public List<Book> getTotalByName(String name)
    {
        return null;
    }

    /**
     * 通过分类搜索图书
     * 该搜索的字段既是该分类的ID
     */
    public List<Book> getTotalByCategoryId()
    {
        return null;
    }

    /**
     * 获取精品推荐
     */
    public List<Book> getTotalIsBoutique()
    {
        return null;
    }

    /**
     * 获取最新列表
     */
    public List<Book> getTotalIsNew()
    {
        return null;
    }

    /**
     * 图书详情
     */
    public Book getBookAbout()
    {
        return null;
    }

}
