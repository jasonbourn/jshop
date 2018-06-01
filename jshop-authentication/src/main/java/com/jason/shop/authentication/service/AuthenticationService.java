package com.jason.shop.authentication.service;

import com.jason.shop.authentication.dao.mapper.TbMemberMapper;
import com.jason.shop.authentication.dao.model.TbMember;
import com.jason.shop.authentication.pojo.form.LoginForm;
import com.jason.shop.common.base.exception.JshopException;
import com.jason.shop.common.base.model.JWT;
import com.jason.shop.common.util.MD5Util;
import com.jason.shop.common.util.TokenUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author qiang on 2018/06/01.
 */
@Service
public class AuthenticationService {
    private static final String SALT ="KPIUXAE4&";
    @Autowired
    private TbMemberMapper tbMemberMapper;

    public String login( LoginForm form){
        TbMember member = tbMemberMapper.selectByName(form.getUsername());
        if (member==null){
            throw JshopException.message("用户不存在！");
        }
        if (!StringUtils.equals(MD5Util.MD5(form.getPassword() + SALT), member.getPassword())){
            throw JshopException.message("登录失败，请检查用户名名和密码！");
        }else {
            return TokenUtil.createToken(new JWT(String.valueOf(member.getId()),member.getUsername()));
        }
    }

    public boolean authCheck(String token){
       JWT jwt= TokenUtil.parseAndValidate(token);
       if (jwt==null||jwt.getExpirationDate().before(new Date())){
           return false;
       }
       return true;
    }
}
