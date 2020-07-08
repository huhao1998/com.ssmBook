package ssmBook.dao;

import org.apache.ibatis.annotations.Param;
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
    public List<Admin> findAll();

    /**
     * 插入Admin
     * @return
     */
    public boolean insert(Admin admin);

    /**
     * 修改Admin
     * @return
     */
    public boolean update(Admin user);

    /**
    * 通过ID查询Admin
     */
    public Admin select(int id);

    /**
     * 通过用户名查询Admin
     */
    public Admin select(@Param("username")String username);

    /**
     * 通过ID 查询Admin列表
     */
    public List<Admin> selectList(int id);

}
