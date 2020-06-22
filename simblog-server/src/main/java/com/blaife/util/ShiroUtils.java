package com.blaife.util;

import com.blaife.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author Blaife
 * @description TODO
 * @data 2020/6/22 23:46
 */
public class ShiroUtils {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
