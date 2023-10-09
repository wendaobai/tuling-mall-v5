package com.tuling.tulingmall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created on 2019/4/8.
 */
@Configuration
@MapperScan({"com.tuling.tulingmall.search.dao"})
public class MyBatisConfig {
}
