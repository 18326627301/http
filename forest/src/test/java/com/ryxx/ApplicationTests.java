package com.ryxx;

import com.ryxx.service.MyClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
class ApplicationTests {


    @Autowired
    private MyClient myClient;


    @Test
    void contextLoads() {

        System.out.println(myClient.test01());

    }


}
