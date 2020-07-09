package ssmBook.dao;


import org.apache.ibatis.annotations.*;
import ssmBook.pojo.Indent;

import java.util.List;

/**
 * 订单Dao层接口
 * @GimmciK 2020.7.8
 */
public interface IndentDao {
    /**
     * 增加订单
     */
    @Insert("insert into indent (total, amount, status, name, phone, address, systime, user_id) "
            + "values (#{total}, #{amount}, #{status}, #{name}, #{phone}, #{address}, now(), #{userId})")
    public boolean insert(Indent indent);

    /**
     * 删除订单
     */
    @Delete("delete from indent where id=#{id}")
    public boolean delete(int id);

    /**
     * 修改订单
     */
    @Update("update indent set total=#{total}, amount=#{amount}, status=#{status}, name=#{name}, "
            + "phone=#{phone}, address=#{address}, user_id=#{userId} where id=#{id}")
    public boolean update(Indent user);

    /**
     * 将订单从未处理标记为已处理
     */
    @Update("update indent set status=#{status} where id=#{id}")
    public boolean updateStatus(@Param("id")int id, @Param("status")byte status);

    /**
     * 通过ID查询该订单
     */
    @Select("select * from indent where id=#{id}")
    public Indent selectById(int id);

    /**
     * 查询一共有多少订单
     */
    @Select("select count(*) from indent")
    public long selectTotal();

    /**
     * 查询一共有多少订单（分是否处理两种情况）
     */
    @Select("select count(*) from indent where status=#{status}")
    public long selectTotalByStatus(@Param("status")byte status);

    /**
     * 查询所有的订单
     */
    @Select("select * from indent order by id desc limit #{begin}, #{size}")
    public List<Indent> selectList(@Param("begin")int begin, @Param("size")int size);

    /**
     * 查询所有的订单（分是否处理两种情况）
     */
    @Select("select * from indent where status=#{status} order by id desc limit #{begin}, #{size}")
    public List<Indent> selectListByStatus(@Param("status")byte status, @Param("begin")int begin, @Param("size")int size);

    /**
     * 通过用户ID查询名下所有订单
     */
    @Select("select * from indent where user_id=#{userIid} order by id desc")
    public List<Indent> selectListByUserid(@Param("userIid")int userIid);

}
