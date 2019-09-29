package com.wzq.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class loginController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        //获取登陆前地址
        String redirect = request.getParameter("redirect");
        //模拟登录
        request.getSession().setAttribute("username","lisi");
        if (redirect != null) {
            //返回给拦截器
            return "redirect:" + redirect;
        } else {
            return "redirect:index";
        }
    }
}
