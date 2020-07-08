package ssmBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import ssmBook.dao.AdminDao;
import ssmBook.pojo.*;

import java.util.List;

/**
 *后台管理员服务
 *订单、用户、图书、分类
 * 注意，例如图书的推优、特惠等服务都通过此实现
 *
 */
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    /**
     * 验证登录
     * 该方法的传入值也可以写为Admin
     * 但需要和Controller一致
     */
    public boolean checkUser(String username,String password)
    {
        return true;
    }

    /**
     * 已经处理订单页面的显示
     */
    public List<Item> getAlreadyItemList()
    {
        return null;
    }

    /**
     * 未处理订单页面的显示
     */
    public List<Item> getUnreadyItemList()
    {
        return null;
    }



    /**
     * 标记处理
     */
    public boolean dealItem()
    {
        return true;
    }

    /**
     * 订单删除
     */
    public boolean itemdelect()
    {
        return true;
    }

    /**
     * 获取用户列表
     */
    public List<User> getUser()
    {
        return null;
    }

    /**
     *删除用户
     */
    public boolean userDelect()
    {
        return true;
    }

    /**
     * 添加用户
     */
    public boolean userAdd()
    {
        return true;
    }

    /**
     *  获取图书列表
     *  只需获取全部，controller那边会处理数据
     */
    public List<Book> getBookList()
    {
        return null;
    }

    /**
     * 图书删除
     */
    public boolean bookdelect()
    {
        return true;
    }

    /**
     * 添加图书
     */
    public boolean bookAdd()
    {
        return true;
    }

    /**
     * 获取分类列表
     */
    public List<Category> getCategoryList()
    {
        return null;
    }

    /**
     * 添加分类
     */
    public boolean categoryAdd()
    {
        return true;
    }

    /**
     * 获取管理员列表
     */
    public List<Admin> getAdminList()
    {
        return null;
    }

    /**
     * 添加管理员
     */
    public boolean adminAdd()
    {
        return true;
    }
}
