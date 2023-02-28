package com.ryxx.controller;

import com.ryxx.service.MyClient;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * ClassName:TestController <br/>
 * Function: TODO. <br/>
 * Reason:   TODO. <br/>
 * Date:     2023/02/28/8:52 <br/>
 *
 * @author guocheng
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class TestController {


    // 注入自定义的 Forest 接口实例
    @Resource
    private MyClient myClient;

    @PostConstruct
    public void testClient() {
        // 调用自定义的 Forest 接口方法
        // 等价于发送 HTTP 请求，请求地址和参数即为 helloForest 方法上注解所标识的内容
        String result = myClient.test01();
        // result 即为 HTTP 请求响应后返回的字符串类型数据
        System.out.println(result);

    }

}
