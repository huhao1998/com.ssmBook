package ssmBook.pojo;


import java.util.Date;
import java.util.List;

/**
 * 订单实体类
 * 记录订单是否处理
 * @GimmciK 2020.7.8
 */
public class Indent {

    // 状态 - 未处理
    public static final byte STATUS_WAIT = 1;
    // 状态 - 已处理
    public static final byte STATUS_DOWN = 2;
    // 状态 - 已删除
    public static final byte STATUS_DELETE = 3;


}
