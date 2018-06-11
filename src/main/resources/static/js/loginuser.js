//判断输入框中是否为空，如果是空返回false，如果不为空返回true
function isTrue() {
    var username = $('#username').val();   //通过上面id为username使用val获得对应的value值
    var password = $('#password').val();   //通过上面id为password使用val获得对应的value值
    console.log("这是username");
    console.log(username);
    if (username == '' || password == ''){
        return false;
    }
    return true;
}
//登陆按钮事件
function login() {
    if (isTrue()) {
        var username = $('#username').val();   //通过上面id为username使用val获得对应的value值
        var password = $('#password').val();   //通过上面id为password使用val获得对应的value值
        $.ajax({
            type : "get",//请求方式
            url : "loginuser/login",//请求地址
            data : {
                "username" : username,
                "password" : password
            },//传递给controller的json数据
            success : function(data) { //返回成功执行回调函数。
            	//如果得到的结果data[0]有值则成功，为0则返回错误。先在数据库中设置好用户名和密码，
				// 然后在浏览器的输入框中输入一遍正确的账号和密码，在输入一次错误的进行对比，得到结果。
                console.log(data);
                if(data[0] != null ){
                    // alert("登陆成功！");
                    /*window.location.reload(); //刷新当前页面*/
                    window.location.href="content";   //在jumpcontroller编写跳转的html，然后就可以跳转了
                }else {
                    alert("你的账号或密码有误！");
                    window.location.reload(); //刷新当前页面
                }
            }
        });
    } else {
        alert("用户名和密码不能为空！");
    }
}
//注册按钮事件
function register(){
    if (isTrue()){
        var username = $('#username').val();   //通过上面id为username使用val获得对应的value值
        var password = $('#password').val();   //通过上面id为password使用val获得对应的value值
        console.log("这是username");
        console.log(username);
        $.ajax({
            type : "get",//请求方式
            url : "loginuser/register",//请求地址
            data : {
                "username" : username,
                "password" : password
            },//传递给controller的json数据
            success : function(data) { //返回成功执行回调函数。
                console.log(data);
                alert("注册成功！请牢记您的以下信息:\n" + "用户名为：" + username + "\n" +"密 码 为：" + password);
                window.location.reload(); //刷新当前页面
            },
            error : function() {//如果出错了，将事件重新绑定
                alert("您输入用户名已被注册！");
                window.location.reload(); //刷新当前页面
            }
        });
    } else {
        alert("用户名和密码不能为空！");
    }
}

//当鼠标在注册按钮上悬停时改变logo文字为用户注册，
// 悬停登陆时改变logo文字为用户登陆
function changeszhuceLogo() {
    $(".logo").text("用户注册");
}
function restorezhuceLogo() {
    $(".logo").text("你好，世界！");
}
function changesLoginLogo() {
    $(".logo").text("用户登陆");
}
function restoreLoginLogo() {
    $(".logo").text("你好，世界！");
}

