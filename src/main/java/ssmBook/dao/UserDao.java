package ssmBook.dao;


import org.apache.ibatis.annotations.*;
import ssmBook.pojo.User;

import java.util.List;

/**
 * 用户Dao层接口
 * @GimmciK 2020.7.8
 */
public interface UserDao {

    /**
     * 增加用户（注册）
     */
    @Insert("insert into users (username, password, phone,address) values (#{username}, #{password}, #{phone}, #{address})")
    @SelectKey(before=false, keyProperty="id", resultType=Integer.class, statement="SELECT LAST_INSERT_ID()")
    public boolean insert(User user);

    /**
     * 删除用户
     */
    @Delete("delete from users where id=#{id}")
    public boolean delete(int id);

    /**
     * 修改用户信息
     */
    @Update("update users set username=#{username}, password=#{password}, phone=#{phone} where id=#{id}")
    public boolean update(User user);

    /**
     * 根据用户ID查询用户
     */
    @Select("select * from users where id=#{id}")
    public User select(int id);

    /**
     * 查询一共有多少个用户
     */
    @Select("select * from users order by id desc limit #{begin}, #{size}")
    public List<User> selectList(@Param("begin")int begin, @Param("size")int size);

    /**
     * 通过名称搜索用户
     */
    @Select("select * from users where username=#{username} limit 1")
    public User selectByUsername(@Param("username")String username);

    /**
     * 用户登录
     */
    @Select("select * from users where username=#{username} and password=#{password}")
    public User selectByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
