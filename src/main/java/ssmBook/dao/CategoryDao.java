package ssmBook.dao;


import org.apache.ibatis.annotations.*;
import ssmBook.pojo.Category;

import java.util.List;

/**
 * 书本分类Dao层接口
 * @GimmciK 2020.7.8
 */
public interface CategoryDao {

    /**
     * 增加分类
     */
    @Insert("insert into category (name) values (#{name})")
    @SelectKey(before=false, keyProperty="id", resultType=Integer.class, statement="SELECT LAST_INSERT_ID()")
    public boolean insert(Category category);

    /**
     * 删除分类
     */
    @Delete("delete from category where id=#{id}")
    public boolean delete(int id);

    /**
     * 修改分类
     */
    @Update("update category set name=#{name} where id=#{id}")
    public boolean update(Category user);

    /**
     * 通过ID查询分类（？？这个方法有用吗）
     */
    @Select("select * from category where id=#{id}")
    public Category select(int id);

    /**
     * 查询分类总数
     */
    @Select("select count(*) from category")
    public long selectTotal();

    /**
     * 查询所有分类（有行列显示要求的）
     */
    @Select("select * from category order by id desc limit #{begin}, #{size}")
    public List<Category> selectList(@Param("begin")int begin, @Param("size")int size);

    /**
     * 查询所有分类（无行列显示要求的）
     */
    @Select("select * from category order by id desc")
    public List<Category> selectListAll();
}
