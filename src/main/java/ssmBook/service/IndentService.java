package ssmBook.service;


import org.springframework.beans.factory.annotation.Autowired;
import ssmBook.dao.IndentDao;
import ssmBook.dao.ItemDao;
import ssmBook.pojo.Indent;
import ssmBook.pojo.Item;

import java.util.List;

/**
 * 订单相关service
 *
 */
public class IndentService {

    @Autowired
    private IndentDao indentDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;


    /**
     * 获取订单列表
     */
    public List<Indent> getIndentList()
    {
        return null;
    }

    /**
     * 处理订单
     */
    public boolean indentReady()
    {
        return true;
    }

    /**
     * 删除订单
     */
    public boolean indentDelect()
    {
        return true;
    }

    /**
     * 添加订单
     */
    public boolean indentAdd()
    {
        return true;
    }

    /**
     * 获取某用户全部订单
     */
    public List<Indent> getIndentByUser()
    {
        return null;
    }

    /**
     * 创建订单项
     *
     */
    public Item itemCreate()
    {
        return null;
    }

    /**
     * 向订单内添加数据
     */
    public Indent ItemAdd()
    {
        return null;
    }

    /**
     * 从订单中减少项目
     */
    public Indent ItemLess()
    {
        return null;
    }

    /**
     * 从订单中删除项目
     */
    public Indent ItemDelect()
    {
        return null;
    }
}
