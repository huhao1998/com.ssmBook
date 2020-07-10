<%--
  Created by IntelliJ IDEA.
  User: Wangyh
  Date: 2020/7/9
  Time: 21:27
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
        <tr><%--从业务角度分析其他值应为默认值--%>
            <td>下单时间</td><td><input type="date" name="date"></td>
        </tr><tr>
            <td>用户账号</td><td><input type="text" name="userId"></td>
    </tr><tr>
            <td>收货人姓名</td><td><input type="text" name="name"></td>
    </tr><tr>
            <td>收货地址</td><td><input type="text" name="address"></td>
    </tr><tr>
            <td>收货人联系方式</td><td><input type="text" name="tel"></td>
    </tr><tr>
            <td><input type="submit" name="cancel" value="取消"></td><td><input type="submit" name="add" value="提交"></td>
        </tr>
    </table>
</form>
