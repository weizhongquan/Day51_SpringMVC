package com.wzq.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String)request.getSession().getAttribute("username");
        //用户已登录  放行
        if (username != null) {
            return true;
        } else {
            //获取用户当前的请求地址
            String requestURI = request.getRequestURI();
            //重定向
            response.sendRedirect("/Day51_SpringMVC_war_exploded/user/login?redirect="+requestURI);
            return false;
        }
    }
}
