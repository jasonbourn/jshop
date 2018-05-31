package com.jason.shop.order.controller;

import com.jason.shop.common.base.model.Result;
import com.jason.shop.order.dao.model.TbUser;
import com.jason.shop.order.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qiang on 2018/05/31.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public Result<List<TbUser>> getAll(){
        return Result.createSuccess(testService.testUser());
    }

}
