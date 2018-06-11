package com.example.demo.controller;

import com.example.demo.config.StatisticConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 页面跳转使用
 *
 * @author
 * @date
 *
 */
@Controller
public class JumpController {
    private final StatisticConfig statisticConfig;

    @Autowired
    JumpController(StatisticConfig statisticConfig){
        this.statisticConfig = statisticConfig;
    }

    /**
     * 跳转到路径
     *
     * @return 页面跳转路径
     */
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("content")
    public String content(){
        return "content";
    }

    @RequestMapping("feedback")
    public String feedback(){
        return "feedback";
    }

    @RequestMapping("practice")
    public String practice() {return  "practice";}

}
