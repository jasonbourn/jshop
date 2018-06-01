package com.jason.shop.authentication.pojo.form;

import javax.validation.constraints.NotBlank;

/**
 * @author qiang on 2018/06/01.
 */

public class LoginForm {
    @NotBlank(message = "请填写用户名！")
    private String username;
    @NotBlank(message = "请填写密码！")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
