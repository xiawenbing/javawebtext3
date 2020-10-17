<%--
  Created by IntelliJ IDEA.
  User: 夏文昺
  Date: 2020/10/13
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    
</head>
<body>
<div id="loginForm">
    <div class="title">
        <span class="titleRegister">账号注册</span>
        <span class="titleLogin"><a href="login.html">已有账号，请登录</a></span>
    </div>
    <form id="registerForm">
        <p><input id="userName" name="userName" type="text" placeholder="用户名" />
            <span class="auth_err" id="userNameError"></span>
        </p>
        <p><input id="chrName" name="chrName" type="text" placeholder="真实姓名" />
            <span class="auth_err" id="chrNameError"></span>
        </p>
        <p><input id="mail" name="mail" type="text" placeholder="邮箱" />
            <span class="auth_err" id="mailError"></span>
        </p>
        <p> <select id="province" name="provinceCode">
            <option value="">请选择省份</option>
        </select>
            <span class="auth_err" id="provinceError"></span>
        </p>
        <p> <select id="city" name="cityCode">
            <option value="">请选择城市</option>
        </select>
            <span class="auth_err" id="cityError"></span>
        </p>
        <p><input id="password" name="password" type="password" placeholder="密码" />
            <span class="auth_err" id="passwordError"></span>
        </p>
        <p><input id="password1" name="password1" type="password" placeholder="确认密码" />
            <span class="auth_err" id="password1Error"></span>
        </p>
        <p>
            <input id="btLogin" type="button" value="注&nbsp;&nbsp;册 " />
            <span class="auth_err" id="checkError"></span>
        </p>
    </form>
</div>

</body>
</html>
