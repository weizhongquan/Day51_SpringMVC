package com.wzq.controller;

import com.wzq.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ResponseBodyController {
    @Resource
    private User user;

    @RequestMapping("/testResponse")
    @ResponseBody
    public String test() {
        user.setUsername("zs");
        user.setPassword("123");
        return user.toString();
    }
    @RequestMapping("/view")
    public ModelAndView view() {
        ModelAndView modelAndView = new ModelAndView();
        user.setUsername("zsd");
        //设置内容   响应前端
        modelAndView.addObject(user);
        //设置 jsp 的名
        modelAndView.setViewName("view");
        return modelAndView;
    }
}
