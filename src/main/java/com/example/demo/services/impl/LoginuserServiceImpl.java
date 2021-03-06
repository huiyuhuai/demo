package com.example.demo.services.impl;

import com.example.demo.dao.LoginuserDao;
import com.example.demo.domain.LoginuserDO;
import com.example.demo.services.LoginuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//是实现接口类

@Service
public  class LoginuserServiceImpl implements LoginuserService {

    @Autowired
    //它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
    //通过 @Autowired的使用来消除 set ，get方法。
    private LoginuserDao loginuserDao;

    /**
     *  loginuser表
     * @return
     */

    @Override
    //标示当前的方法定义将覆盖超类中的方法他告诉我们同时也告诉编译器我们的这些方法
    // 肯定覆盖了类**里面的方法，如果注释掉类**里面的方法 那么就会报错，它需要全部
    // 覆盖某个接口的方法。
    //登陆按钮
    public List<LoginuserDO> login(String username,String password) {
        return loginuserDao.login(username,password);
    }

    //注册按钮
    public List<LoginuserDO> register(String username,String password) {
        return loginuserDao.register(username,password);
    }
}
