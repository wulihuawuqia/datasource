package com.demo.demo;

import com.demo.demo.dao.BsSgmtRepo;
import com.demo.demo.service.BsSgmtService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private BsSgmtService bsSgmtService;

    @Resource
    private BsSgmtRepo bsSgmtRepo;
    @Test
    void contextLoads() {
        System.out.println(bsSgmtRepo);
    }

}
