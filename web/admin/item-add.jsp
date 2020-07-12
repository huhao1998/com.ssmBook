<%--
  Created by IntelliJ IDEA.
  User: Yokyi
  Date: 2020/7/12
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    input[type=button], input[type=submit], input[type=reset] {
        background-color: #4CAF50;
        border: none;
        color: white;
        text-decoration: none;
        margin: 4px 2px;
        cursor: pointer;
        width: 80px;
        height: 30px;
    }
</style>
<form method="post" action=""><%--后续补充--%>
    <table align="center">
        <tr><%--从业务角度分析其他值应为默认值，订单编号--%>
            <td>图书编号</td><td><input type="text" name="bookid"></td>
        </tr><tr>
        <td>图书名称</td><td><input type="text" name="bookName"></td>
    </tr><tr>
        <td>图书单价</td><td><input type="text" name="bookPrice"></td>
    </tr><tr>
        <td>图书数量</td><td><input type="text" name="bookNum"></td>
    </tr><tr>
        <td><input type="submit" name="cancel" value="取消"></td><td><input type="submit" name="add" value="提交"></td>
    </tr>
    </table>
</form>

