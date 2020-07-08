package ssmBook.controller.Index;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ssmBook.service.BookService;
import ssmBook.service.IndentService;
import ssmBook.service.UserService;

/**
 * 用户相关Controller
 * 登录、注册、查看购物车、增加、减少商品
 */
public class UserController {

    private static final String indentKey = "indent";

    /**
     *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     *
     * 该变量的作用为读取后台的书本数据。
     */

    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @Autowired
    private IndentService indentService;

    /**
     * 注册用户
     */
    @RequestMapping("/reg")
    public String reg()
    {
        return "";
    }

    /**
     * 注册用户按钮实现
     */
    @RequestMapping("/register")
    public String register()
    {
        return "";
    }

    /**
     * 用户登录
     */
    @RequestMapping("/log")
    public String log()
    {
        return "";
    }

    /**
     * 用户登录按钮的实现
     */
    @RequestMapping("/login")
    public String login()
    {
        return "";
    }

    /**
     * 用户注销
     *
     */
    @RequestMapping("/logout")
    public String logout()
    {
        return "";
    }

    /**
     * 查看购物车
     */
    @RequestMapping("/cart")
    public String cart()
    {
        return "";
    }

    /**
     * 购买书籍
     * 添加进购物车
     */
    @RequestMapping("/buy")
    public String buy()
    {
        return "";
    }

    /**
     * 减少数量
     */
    @RequestMapping("/lessen")
    public String lessen()
    {
        return "";
    }

    /**
     * 删除书籍
     */
    @RequestMapping("/delect")
    public String delect()
    {
        return "";
    }

    /**
     * 提交订单
     */
    @RequestMapping("/save")
    public String save()
    {
        return "";
    }

    /**
     * 查看订单
     */
    @RequestMapping("/order")
    public String order()
    {
        return "";
    }

}
