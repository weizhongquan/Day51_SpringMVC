package com.wzq.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Page")
public class PageController {
    @RequestMapping(value = "/getPage",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> getPage() {
        List<String> list = new ArrayList();
        list.add("翔龙");
        list.add("十八");
        list.add("娼");
        list.add("回首");
        list.add("掏");
        return list;
    }
}
