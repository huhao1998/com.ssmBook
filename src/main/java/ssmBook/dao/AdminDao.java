package ssmBook.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ssmBook.pojo.Admin;

import java.util.List;

/**
 * 管理员Dao层接口
 * @author Gimmick 2020.7.8
 */
public interface AdminDao {

    /**
     * 查询所有Admin
     * @return
     */
    @Select("select * from admin")
    public List<Admin> findAll();

    /**
     * 通过ID查询Admin
     */
    @Select("select * from admin where id=#{id}")
    public Admin selectById(int id);

    /**
     * 插入Admin
     * @return
     */
    @Insert("insert into admin (username, password) values (#{username}, #{password})")
    public boolean adminInsert(Admin admin);

    /**
     * 修改Admin密码
     * @return
     */
    @Update("update admin set password=#{password} where id=#{id}")
    public boolean adminUpdate(Admin admin);




    /**
     * 通过用户名查询Admin
     */
    @Select("select * from admin where username like #{username} limit 1")
    public Admin selectByName(@Param("username")String username);

    /**
     * 通过ID 查询Admin列表
     */
    @Select("select * from admin where id = #{id}")
    public List<Admin> selectList(int id);

}
