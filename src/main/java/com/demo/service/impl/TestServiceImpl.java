package com.demo.service.impl;

import com.demo.service.TestService;
import com.lorne.tx.annotation.TxTransaction;
import com.demo.dao.TestDao;
import com.demo.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lorne on 2017/6/7.
 */
@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestDao testDao;

    @Autowired
    private Test2Service test2Service;


    @Override
    public String hello() {

        String name = "hello";
        testDao.update(name);

        String res =  test2Service.test();
        return res;
    }

}
