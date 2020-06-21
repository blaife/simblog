package com.blaife;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimblogApplicationTests {

    @Test
    void contextLoads() {

        System.out.println(SecureUtil.md5("96e79218965eb72c92a549dd5a330112"));

    }

}
