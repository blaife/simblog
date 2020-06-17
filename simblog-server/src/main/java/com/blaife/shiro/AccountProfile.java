package com.blaife.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Blaife
 * @description 用户登录时信息验证所需要的数据
 * @data 2020/6/17 21:43
 */
@Data
public class AccountProfile implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮件
     */
    private String email;

    /**
     * 状态
     */
    private Integer status;
}
