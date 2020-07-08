package ssmBook.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ssmBook.service.UserService;

public class userController {

    /**
     *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     */
    @Autowired
    private UserService userService;

    /**
     * 用户列表
     */
    @RequestMapping("/userList")
    public String userList()
    {
        return "0";
    }

    /**
     * 用户添加
     */
    @RequestMapping("/userAdd")
    public String userAdd()
    {
        return "0";
    }
    /**
     * 用户密码重置
     */
    @RequestMapping("/userResetPwd")
    public String userRe()
    {
        return "0";
    }

    /**
     * 顾客电话号码更改
     */
    @RequestMapping("/userResetPhone")
    public String userResetPhone()
    {
        return "0";
    }

    /**
     * 删除用户
     */
    @RequestMapping("/delectUser")
    public String delectUser()
    {
        return "0";
    }
}
