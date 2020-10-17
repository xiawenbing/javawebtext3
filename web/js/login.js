function changeCode() {
document.getElementById("verifyCode").src="demo1?t="+ Math.random();
}

var xmlHttp;
//创建XMLHttpRequest对象
function createXmlHttp() {
    if (window.XMLHttpRequest) {
        xmlHttp=new  XMLHttpRequest();
    } else {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
}

var userName_correct = false;
var password_correct = false;
var vcode_correct = false;

/*function jqAjaxCheckLogin() {
    if (!userName_correct || !password_correct || !vcode_correct) {
        $("#username").blur();
        $("#password").blur();
        $("#vcode").blur();
        return  ;
    }
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var vcode = document.getElementById("vcode").value;
    var data = "username=" + username + "&password=" + password + "&vcode=" + vcode;
    createXmlHttp();
    xmlHttp.open("post", "/demo3", true);
    xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xmlHttp.send(data);

    xmlHttp.onreadystatechange = function() { //回调函数
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var response = xmlHttp.responseText;
            var json = JSON.parse(response); //调用系统函数将字符串转换为json对象
            if (json.code == 0) { //登录成功
                window.location.href = "jsp/other/main.jsp";
            } else { //登录失败
                document.getElementById("checkError").innerText = json.info; //显示返回错误信息
            }
        }
    }
}*/

function jqAjaxCheckLogin()
{
    if (!userName_correct || !password_correct || !vcode_correct) {
        $("#username").blur();
        $("#password").blur();
        $("#vcode").blur();
        return  ;
    }
    var data;
    if (!Boolean.valueOf($("#autoLogin").val())) {
        data = {username: $("#username").val(), password: $("#password").val(), vcode: $("#vcode").val()}
    } else {
        data = {
            username: $("#username").val(),
            password: $("#password").val(),
            vcode: $("#vcode").val(),
            autoLogin: "y"
        }
    }
    $.ajax({
        type: "post",
        url: "demo3",
        data: data,
        dataType: "json",
        success: function(response) {
            if (response.code == 0) {
                window.location.href = "jsp/other/main.jsp";
            } else {
                $("#checkError").text(response.info);
            }
        }
    });



}

$(document).ready(function() {
    $("#username").blur(function() {
        if ($(this).val() == "") {
            $("#userNameError").text("用户名不能为空！");
        } else {
            $("#userNameError").text("");
            userName_correct = true;
        }
    });

    $("#password").blur(function() {
        if ($(this).val() == "") {
            $("#passwordError").text("密码不能为空！");
        } else {
            $("#passwordError").text("");
            password_correct = true;
        }
    });

    $("#vcode").blur(function() {
        if ($(this).val() == "") {
            $("#vcodeError").text("验证码不能为空！");
        } else {
            $("#vcodeError").text("");
            vcode_correct = true;
        }
    });
});