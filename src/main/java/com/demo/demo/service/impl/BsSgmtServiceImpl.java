package com.demo.demo.service.impl;

import com.demo.demo.dao.BsSgmtRepo;
import com.demo.demo.entity.BsSgmt;
import com.demo.demo.hivedao.HiveBsSgmtRepo;
import com.demo.demo.service.BsSgmtService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 描述:
 * 个人基本信息段
 *
 * @author qia.wu
 * @create 2020-02-28 10:00
 * @see com.demo.demo.service.impl
 */
@Service
public class BsSgmtServiceImpl implements BsSgmtService {

    @Resource
    BsSgmtRepo bsSgmtRepo;

    @Resource
    HiveBsSgmtRepo hiveBsSgmtRepo;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(BsSgmt bsSgmt) {
        bsSgmtRepo.save(bsSgmt);
        //throw new RuntimeException("11213");
    }
}
