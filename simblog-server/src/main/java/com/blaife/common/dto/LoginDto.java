package com.blaife.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Blaife
 * @description 登录dto
 * @data 2020/6/21 22:28
 */
@Data
public class LoginDto implements Serializable {


    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

}
