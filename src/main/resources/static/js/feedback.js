//判断输入框中是否为空，如果是空返回false，如果不为空返回true
function isTrue() {
    var name = $('.user').val();   //通过上面id为username使用val获得对应的value值
    var sex = $('.budget').val();   //通过上面id为password使用val获得对应的value值
    var email = $('.email').val();   //通过上面id为password使用val获得对应的value值
    var problem = $('.message').val();   //通过上面id为password使用val获得对应的value值
    var provinces = $('.provinces').val();   //通过上面id为password使用val获得对应的value值
    if (name == '' || email == '' || provinces == ''){
        return false;
    }
    return true;
}
//输入的性别为男还是女
function boyORgirl() {
    var sex = $('.budget').val();   //通过上面id为password使用val获得对应的value值
    if (sex == "性别"){
        return false;
    }
    return true;
}
//判断反馈的问题
function advice() {
    var problem = $('.message').val();   //通过上面id为password使用val获得对应的value值
    if (problem == ''){
        return false;
    }
    return true;
}

function finish(){
    var name = $('.user').val();   //通过上面id为username使用val获得对应的value值
    var sex = $('.budget').val();   //通过上面id为password使用val获得对应的value值
    var email = $('.email').val();   //通过上面id为password使用val获得对应的value值
    var problem = $('.message').val();   //通过上面id为password使用val获得对应的value值
    var provinces = $('.provinces').val();   //通过上面id为password使用val获得对应的value值
    if (name != '' || email != '' || provinces != '' || problem != '' ){
        return false;
    }
    return true;
}


function commit() {
    if (isTrue()) {
        // if (boyORgirl()) {
            if(advice()){
                if (finish()){

        var name = $('.user').val();   //通过上面id为username使用val获得对应的value值
        var email = $('.email').val();   //通过上面id为password使用val获得对应的value值
        var provinces = $('.provinces').val();
        var sex = $('.budget').val();   //通过上面id为password使用val获得对应的value值
        var problem = $('.message').val();   //通过上面id为password使用val获得对应的value值
            $.ajax({
            type : "get",//请求方式
            url : "http://localhost/management/commit",//请求地址
            data : {
                "name" : name,
                "email"  : email,
                "provinces" : provinces,
                "sex"  : sex,
                "problem"  : problem
            },//传递给controller的json数据
            success : function(data) { //返回成功执行回调函数。
                console.log(data);
            }

        });
                    console.log(data); }
                // else {
                //     // layer.msg('请选择您的性别！', {
                //     //     // offset : '35%',
                //     //     time : 5000            //两秒
                //     // });
                //     // function gengxing() {
                //         $("#tijiao").attr("onclick","return false");
                //     alert("请选择正确的性别！！！");
                //
                //     // window.location.reload(); //刷新当前页面
                //     // }
                //     // setTimeout(gengxing,5000);
                // }

            }
        // }
        // else {
        //     // debugger;
        //         layer.msg('请选择您的性别！', {
        //             // offset : '35%',
        //             time : 5000            //两秒
        //         });
        //     // function gengxing() {
        //     //     window.location.reload(); //刷新当前页面
        //     // }
        //     // setTimeout(gengxing,5000);
        //
        //     // alert("请选择正确的性别！！！");
        //     // debugger;
        //         // $("#tijiao").attr("onclick","return false");
        // }
    } else {}
}
