package com.example.demo.services;
import com.example.demo.domain.LoginuserDO;

import java.util.List;

public interface LoginuserService {

     /*登陆按钮*/
     List<LoginuserDO> login(String username,String password);

     /*注册按钮*/
     List<LoginuserDO> register(String username,String password);
}



