package com.demo.demo.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 描述:
 * 主数据源
 *
 * @author qia.wu
 * @create 2020-02-27 20:51
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {"com.demo.demo.hivedao"} // 设置dao所在位置
)
public class SecDataSource {

    @Bean(name = "dataSourceSec")
    @Qualifier("dataSourceSec")
    @ConfigurationProperties("spring.datasourceSec")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplateSec")
    public JdbcTemplate test2SqlSessionTemplate(@Qualifier("dataSourceSec") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
