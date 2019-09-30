package com.chenyz.back01.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录名
     */
    @NotNull(message = "用户名不能为空")
    private String username;

    /**
     * 登录密码
     */
    @NotNull(message = "密码不能为空")
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return username - 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置登录名
     *
     * @param username 登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}