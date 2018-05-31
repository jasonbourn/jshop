package com.jason.shop.order.service;

import com.jason.shop.order.dao.mapper.TbUserMapper;
import com.jason.shop.order.dao.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiang on 2018/05/31.
 */
@Service
public class TestService {
    @Autowired
    private TbUserMapper tbUserMapper;

    public List<TbUser> testUser(){
        return  tbUserMapper.selectAll();
    }

}
