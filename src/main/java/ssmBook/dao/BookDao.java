package ssmBook.dao;


import org.apache.ibatis.annotations.*;
import ssmBook.pojo.Book;

import java.util.List;

/**
 * 书本Dao层接口
 * @GimmciK 2020.7.8
 */
public interface BookDao {

    /**
     * 添加图书
     */
    @Insert("insert into book (name, cover, price, intro, auther, press, pubdate, special, news, sale, category_id,count) "
            + "values (#{name}, #{cover}, #{price}, #{intro}, #{auther}, #{press}, #{pubdate}, #{special}, #{news}, #{sale}, #{categoryId}, #{count})")
    public boolean insert(Book book);

    /**
     *删除图书
     */
    @Delete("delete from book where id = #{id}")
    public boolean bookDelect(int id);

    /**
     * 修改图书
     */
    @Update("update book set name=#{name}, cover=#{cover}, price=#{price}, intro=#{intro}, auther=#{auther}, auther=#{auther}, "
            + "press=#{press}, pubdate=#{pubdate}, special=#{special}, news=#{news}, sale=#{sale}, category_id=#{categoryId}, count=#{count} where id=#{id}")
    public boolean update(Book newbook);

    /**
     * 根据id查询图书
     */
    @Select("select * from book where id=#{id}")
    public Book selectById(int id);

    /**
     * 查询共有多少本图书
     */
    @Select("select count(*) from book")
    public long selectTotal();

    /**
     * 通过名称查询图书共有多少本（like）
     */
    @Select("select count(*) from book where name like concat('%',#{name},'%')")
    public long selectTotalLikeName(@Param("name")String name);

    /**
    *查询该分类下共有多少本图书
     */
    @Select("select count(*) from book where category_id=#{categoryId}")
    public long sleectTotalByCategoryId();

    /**
     * 查询有多少本书被设为最新
     */
    @Select("select count(*) from book where news=1")
    public long selectTotalIsNews();

    /**
     * 显示所有图书
     */
    @Select("select * from book order by id desc limit #{begin}, #{size}")
    public List<Book> selectList(@Param("begin")int begin, @Param("size")int size);

    /**
     * 通过名字查询图书
     * 注意：不止唯一结果
     */
    @Select("select * from book where name like concat('%',#{name},'%') order by id desc limit #{begin}, #{size}")
    public List<Book> selectListLikeName(@Param("name")String name, @Param("begin")int begin, @Param("size")int size);

    /**
     * 通过分类查询图书
     */
    @Select("select * from book where category_id=#{categoryId} order by id desc limit #{begin}, #{size}")
    public List<Book> selectListByCategoryId(@Param("categoryId")int categoryId, @Param("begin")int begin, @Param("size")int size);

    /**
     * 查询特别推荐图书
     */
    @Select("select * from book where special=1 order by id desc limit #{begin}, #{size}")
    public List<Book> selectListIsSpecial(@Param("begin")int begin, @Param("size")int size);

    /**
     * 查询最近上新图书
     */
    @Select("select * from book where news=1 order by id desc limit #{begin}, #{size}")
    public List<Book> selectListIsNews(@Param("begin")int begin, @Param("size")int size);



}
