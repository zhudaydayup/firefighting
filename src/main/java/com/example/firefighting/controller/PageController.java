package com.example.firefighting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 15:03 2019/7/22
 * @ Description：${description}
 * @ Modified By：
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("test")
    public String test(){
        return "/test.html";
    }
    @RequestMapping("index")
    public String index(){
        return "/check/index.html";
    }

}
