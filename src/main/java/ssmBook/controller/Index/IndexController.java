package ssmBook.controller.Index;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ssmBook.service.BookService;

/**
 * 书店首页Controller
 */
public class IndexController {

    /**
    *原先项目中的该变量设置为自动填装@Autowired在service层中自动实现
     *考虑到貌似大家都对spring不太熟悉，则也可通过构造函数的方式实现^^
     *如果会写相应的service层，则也可使用自动填装，将new BookService()删去即可。
     *
     *
     * 该变量的作用为读取后台的书本数据。
     */

    private BookService bookService=new BookService();

    /**
     * 书店首页
     */
    @RequestMapping("/index")
    public String index()
    {
        return "";
    }
    /**
    *   书店简介
     */
    @RequestMapping("/about")
    public String about()
    {
        return "";
    }

    /**
     * 精品推荐
     */
    @RequestMapping("/special")
    public String special()
    {
        return "";
    }

    /**
     * 最新出版
     * 注意，new在java中为关键字，故该方法名写为news
     */
    @RequestMapping("/news")
    public String news()
    {
        return "";
    }

    /**
     *图书详情
     */
    @RequestMapping("/detail")
    public String detail()
    {
        return "";
    }

    /**
     * 图书名称搜索
     */
    @RequestMapping("/search")
    public String search()
    {
        return "";
    }



}
