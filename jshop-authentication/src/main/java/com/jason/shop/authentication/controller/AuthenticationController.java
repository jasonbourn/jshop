package com.jason.shop.authentication.controller;

import com.jason.shop.authentication.pojo.form.LoginForm;
import com.jason.shop.authentication.service.AuthenticationService;
import com.jason.shop.common.base.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author qiang on 2018/06/01.
 */
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("login")
    public Result<String> login(@Valid LoginForm form){
        return Result.createSuccess(authenticationService.login(form));
    }

    @PostMapping("authCheck")
    public Result<Boolean> login(String token){
        return Result.createSuccess(authenticationService.authCheck(token));
    }
}
