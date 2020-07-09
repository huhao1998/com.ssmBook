package ssmBook.dao;


import org.apache.ibatis.annotations.*;
import ssmBook.pojo.Item;

import java.util.List;

/**
 * 订单项目Dao层接口
 * @GimmciK 2020.7.8
 */
public interface ItemDao {

    /**
     * 增加订单项目（添加购物车）
     */
    @Insert("insert into items (price, amount, book_id, indent_id) values (#{price}, #{amount}, #{bookId}, #{indentId})")
    public boolean insert(Item item);

    /**
     * 删除订单项目
     */
    @Delete("delete from items where id=#{id}")
    public boolean deleteById(int id);

    /**
     *修改订单项目（这有啥用？？貌似是用在增加和减少商品数量）
     */
    @Update("update items set price=#{price}, amount=#{amount}, book_id=#{bookId}, indent_id=#{indentId} where id=#{id}")
    public boolean update(Item item);

    /**
     * 通过订单项目ID查询订单项目
     */
    @Select("select * from items where id=#{id}")
    public Item select(int id);

    /**
     * 查询订单项目总数
     */
    @Select("select count(*) from items")
    public long selectTotal();

    /**
     * 查询一整张订单内的所有订单项目
     */
    @Select("select * from items where indent_id=#{indentId}")
    public List<Item> selectListByIndentId(@Param("indentId")int indentId);

}
