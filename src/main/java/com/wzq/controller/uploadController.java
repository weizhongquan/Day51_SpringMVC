package com.wzq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class uploadController {
    /*
     * 上传多个文件
     */
    @RequestMapping(value = "/upload", produces = "application/json;charset=UTF-8")
    public @ResponseBody
    boolean uploadFiles(@RequestParam("file_upload") MultipartFile [] files) {
        boolean result = false;
        String realPath = null;
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isEmpty()) {
                //得到文件名
                try {
                    String uniqueName = files[i].getOriginalFilename();
                    files[i].transferTo(new File(realPath));  // 转存文件
                    result = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
