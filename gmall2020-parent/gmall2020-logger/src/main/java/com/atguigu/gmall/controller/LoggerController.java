package com.atguigu.gmall.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * controller用于接收模拟生成的日志
 * @author ming
 * @date 2021/7/6 15:21
 */
@RestController
public class LoggerController {
    //通过requestMapping屁屁额请求并交给方法处理
    @RequestMapping("/applog")
    //在模拟数据生成的代码中，将数据封装为json，通过post传递给该controller处理
    public String applog(@RequestBody String jsonLog){
        System.out.println(jsonLog);
        return jsonLog;
    }
}
