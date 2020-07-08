package ssmBook.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ssmBook.service.AdminService;

public class adminController {

    /**
     *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     */
    @Autowired
    private AdminService adminService;


    /**
     * 管理员列表
     * @return
     */
    @RequestMapping("/adminList")
    public String adminList()
    {
        return "0";
    }

    /**
     * 添加管理员
     */
    @RequestMapping("/adminAdd")
    public String adminAdd()
    {
        return "0";
    }

    /**
     * 重置管理员密码
     */
    @RequestMapping("/adminResetPwd")
    public String adminResetPwd()
    {
        return "0";
    }

    /**
     * 删除管理员
     */
    @RequestMapping("/adminDelect")
    public String adminDelect()
    {
        return "";
    }
}
