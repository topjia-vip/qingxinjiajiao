package com.it.qingxin.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author wjh
 * @create 2019-09-02 19:47
 */
//@Configurable
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //开启驼峰命名法的映射规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
