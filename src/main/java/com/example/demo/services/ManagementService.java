package com.example.demo.services;

import com.example.demo.domain.FeedbackDO;

import java.util.List;

public interface ManagementService {

     //标示当前的方法定义将覆盖超类中的方法他告诉我们同时也告诉编译器我们的这些方法
     // 肯定覆盖了类**里面的方法，如果注释掉类**里面的方法 那么就会报错，它需要全部
     // 覆盖某个接口的方法。
     //登陆按钮
     List<FeedbackDO> commit(String name,String email,String provinces,String sex,String problem);
}



