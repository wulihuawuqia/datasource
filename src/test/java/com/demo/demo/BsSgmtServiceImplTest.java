package com.demo.demo;

import com.alibaba.fastjson.JSONObject;
import com.demo.demo.dao.BsSgmtRepo;
import com.demo.demo.entity.BsSgmt;
import com.demo.demo.service.BsSgmtService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author qia.wu
 * @create 2020-02-28 10:05
 * @see com.demo.demo.service.impl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes=DemoApplication.class)
@WebAppConfiguration
public class BsSgmtServiceImplTest {

    @Resource
    private BsSgmtService bsSgmtService;

    @Resource
    private BsSgmtRepo bsSgmtRepo;

    @Test
    public void save() {
        BsSgmt bsSgmt = bsSgmtRepo.findOne(10000L);
        bsSgmt.setName("abdc");
        System.out.println(JSONObject.toJSONString(bsSgmt));
        bsSgmtService.save(bsSgmt);
    }
}
