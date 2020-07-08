package ssmBook.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ssmBook.service.CategoryService;

public class categoryController {
    /**
     *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     */
    @Autowired
    private CategoryService categoryService;
    /**
     * 分类列表
     */
    @RequestMapping("categoryList")
    public String categoryList()
    {
        return "0";
    }

    /**
     * 添加分类
     */
    @RequestMapping("categoryAdd")
    public String categoryAdd()
    {
        return "0";
    }
}
