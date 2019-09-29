package com.wzq.controller;

import com.wzq.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
@RequestMapping("/HelloController")
@Slf4j
public class HelloController {
    /*
     *   使用对象接收表单数据
     *   对象属性必须跟表单的name值相等
     * */
    @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(User user) {
        log.debug(user.toString());
        return "添加";
    }
    /*
     *   动态路径
     *   需要接收请求路径的参数
     *   方法中的参数必须添加 @PathVariable 的修饰
     * */
    @RequestMapping(value = "/getPage/{page}/{args}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public String getPage(@PathVariable String page,@PathVariable String args) {
        log.debug("page:"+page);
        log.debug("args:"+args);
        return "动态路径获取";
    }
}
