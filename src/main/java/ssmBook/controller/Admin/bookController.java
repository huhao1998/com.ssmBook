package ssmBook.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ssmBook.service.BookService;

public class bookController {

    /**
     *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     */
    @Autowired
    private BookService bookService;

    /**
     * 图书列表
     * 可通过if语句将图书列表分为推荐列表、最新列表等
     * 如有困难，可将该方法分成3个方法，逐一编写
     */
    @RequestMapping("/bookList")
    public String bookList()
    {
        return "0";
    }

    /**
     * 图书添加
     */
    @RequestMapping("/bookAdd")
    public String bookAdd()
    {
        return "0";
    }

    /**
     * 图书修改
     */
    @RequestMapping("/bookUpdate")
    public String bookUpdate()
    {
        return "0";
    }

    /**
     * 图书设置
     * 设为推荐、设为最新
     */
    @RequestMapping("/bookSet")
    public String bookSet()
    {
        return "0";
    }
}
