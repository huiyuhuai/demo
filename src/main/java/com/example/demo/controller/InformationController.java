package com.example.demo.controller;

import com.example.demo.domain.InformationDO;
import com.example.demo.domain.StudentDO;
import com.example.demo.services.InformationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 学生信息列表
 * controller层
 *
 * ！！！！！！！！
 * 注解的概念：
 * 在一个稍大的项目中，通常会有上百个组件，如果这些组件采用xml的bean定义来配置，
 * 显然会增加配置文件的体积，查找以及维护起来也不太方便。 Spring2.5为我们引入了
 * 组件自动扫描机制，他可以在类路径底下寻找标注了@Component,@Service,@Controller,@Repository
 * 注解的类，并把这些类纳入进spring容器中管理
 * ！！！！！！！！
 *
 * @author
 * @date 2018-05-31
 */
//使用它标记的类就是一个SpringMVC Controller对象（通俗的说，被Controller标记的类就是一个控制器，这个类中的方法，就是相应的动作）
@Controller
//是一个用来处理请求地址映射的注解，可用于类或方法上。
// 用于类上，表示类中的所有响应请求的方法都是以该地址作为——“父路径”。
@RequestMapping("Information")
public class InformationController {

    //final声明的只能读取不能继承或修改的其他的
    private final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }

    /**
     * information表
     * @return
     */
    @GetMapping("listInformation")
    @ResponseBody
    //@Responsebody 注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，一般在异步获取数据时使用；
    // 在使用 @RequestMapping 后，返回值通常解析为跳转路径，加上 @Responsebody 后返回结果不会被解析为跳转路径，而
    // 是直接写入HTTP 响应正文中。例如，异步获取 json 数据，加上 @Responsebody 注解后，就会直接返回 json 数据。
    //@RequestBody 注解则是将 HTTP 请求正文插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。
    public List<InformationDO> listInformation() {
        return informationService.listInformation();
    }

    /*student表*/
     @GetMapping("listStudent")
     @ResponseBody
     public  List<StudentDO>listStudent(){
         return informationService.listStudent();
     }
}
