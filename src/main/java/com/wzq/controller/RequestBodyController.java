package com.wzq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class

RequestBodyController {
    /*
     *   get请求跟post请求的区别
     *   post请求有请求体 get请求是没有请求体
     *
     *   @RequestBody
     *   获取请求体的数据
     *
     *   required 元素指定参数是否允许为null true为不允许为空,false允许为空
     *
     * */
    @RequestMapping(value = "/test",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test(@RequestBody String username,@RequestBody Integer age) {
        log.debug("username:"+username);
        log.debug("age:"+age);
        return "请求体测试";
    }
}
