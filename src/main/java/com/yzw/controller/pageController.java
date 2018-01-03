package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 袁仔文
 * @date 2018/1/3 14:08
 */
@Controller
public class pageController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
