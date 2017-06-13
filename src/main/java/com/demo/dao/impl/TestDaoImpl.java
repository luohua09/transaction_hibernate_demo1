package com.demo.dao.impl;

import com.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lorne on 2017/6/8.
 */
@Repository
public class TestDaoImpl implements TestDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void update(String name) {
        String sql = "update t_test set name = ? where id = 1 ";
        jdbcTemplate.update(sql,name);
    }


}
