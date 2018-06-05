package com.example.demo.dao;

import com.example.demo.domain.LoginuserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * dao层
 *
 * @author
 * @date 2018-05-29
 */
@Mapper
//添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
//需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
//也就是说这个接口是不支持重载的

@Repository
//为什么 @Repository 只能标注在 DAO 类上呢？这是因为该注解的作用不只是将类识别为Bean，
// 同时它还能将所标注的类中抛出的数据访问异常封装为 Spring 的数据访问异常类型。 Spring
// 本身提供了一个丰富的并且是与具体的数据访问技术无关的数据访问异常结构，用于封装不同的
// 持久层框架抛出的异常，使得异常独立于底层的框架。
public interface LoginuserDao {
    /**
     * 登陆按钮
     * @return
     */
   List<LoginuserDO> login(@Param("username") String username, @Param("password") String password);

   /*注册按钮*/
    List<LoginuserDO>register(@Param("username")String username, @Param("password") String password);

}
