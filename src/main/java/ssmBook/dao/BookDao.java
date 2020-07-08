package ssmBook.dao;


import ssmBook.pojo.Book;

/**
 * 书本Dao层接口
 * @GimmciK 2020.7.8
 */
public interface BookDao {

    /**
     * 添加图书
     */
    public boolean insert(Book book);

    /**
     *
     */
}
