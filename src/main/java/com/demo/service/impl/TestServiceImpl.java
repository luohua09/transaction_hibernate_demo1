package com.demo.service.impl;

import com.demo.dao.TestDao;
import com.demo.entity.Test;
import com.demo.service.Test2Service;
import com.demo.service.TestService;
import com.lorne.tx.annotation.TxTransaction;
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
    @TxTransaction
    public String hello() {

        String name = "hello_demo1";
        Test test = new Test();
        test.setName(name);
        testDao.save(test);


        String res =  test2Service.test();

        //int v = 100/0;

        return res;
    }

}
