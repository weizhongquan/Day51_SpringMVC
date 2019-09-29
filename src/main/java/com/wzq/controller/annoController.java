package com.wzq.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anno")
public class annoController {
    @RequestMapping(value = "/testRequestParam",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    /* @RequestParam 定义 前端传送过来的参数传给控制器参数  前端的name 赋值给username  */
    /* @RequestParam 定义 前端传送过来的参数传给控制器参数  前端的name 赋值给username1231231  */
    public String testRequestParam(@RequestParam(value = "name") String username) {
        System.out.println(username);
        return "测试RequestParam";
    }
    @RequestMapping(value = "/testRequestBody",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了。。。。。");
        System.out.println(body);
        return "1";
    }
    /* 用于绑定url中的占位符*/
    @RequestMapping(value = "/testPathVariable/{sid}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testPathVaribale(@PathVariable(name = "sid") String sid) {
        System.out.println(sid);
        return "测试PathVariable";
    }
    /* 用于获取请求头信息 */
    @RequestMapping(value = "/testRequestHeader",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testRequestHeader(@RequestHeader(value = "Accept") String head) {
        System.out.println(head);
        return "测试RequestHeader";
    }
    /* 用于把指定的cookie名称的值传入控制器方法参数 */
  /*  @RequestMapping(value = "/testCookieValue",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "测试CookieValue";
    }*/

}
