package com.blaife.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Blaife
 * @description Mybatis-Plus 配置文件
 * @data 2020/6/14 21:15
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.blaife.mapper")
public class MybatisPlusConfig {


    /**
     * 添加分页插件
     * @return paginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}
