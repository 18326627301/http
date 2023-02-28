package com.ryxx.service;

import com.dtflys.forest.annotation.*;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * ClassName:MyClient <br/>
 * Function: TODO. <br/>
 * Reason:   TODO. <br/>
 * Date:     2023/02/28/9:00 <br/>
 *
 * @author guocheng
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public interface MyClient {


    /**
     * GET http://localhost:8080/hello/user?uname=foo
     * HEADER:
     * Accept: text/plain
     */
    @Get(url = "http://localhost:8090/allTest",
            headers = "Accept: text/plain")
    String test01();


    /**
     * GET http://localhost:8080/hello/user?uname=foo
     * HEADER:
     * Accept: text/plain
     */
    @Get(url = "http://localhost:8090/allTest",
            headers = "Accept: text/plain")
//    @GetRequest(url = "http://localhost:8090/allTest",
//            headers = "Accept: text/plain")
    String helloForest(@Query("uname") String username);


}
