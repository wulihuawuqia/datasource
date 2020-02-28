package com.demo.demo.spring;

/**
 * 描述:
 * hive 链接池配置
 *
 * @author qia.wu
 * @create 2020-02-25 16:09
 */

import lombok.extern.log4j.Log4j2;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Log4j2
@EnableJpaRepositories(
        basePackages = {"com.demo.demo.hivedao"} // 设置dao所在位置
)
public class HiveJdbcConfig {

    @Autowired
    private Environment env;

    @Bean(name = "hiveJdbcDataSource")
    @Qualifier("hiveJdbcDataSource")
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(env.getProperty("hive.url"));
        dataSource.setDriverClassName(env.getProperty("hive.driver-class-name"));
        dataSource.setUsername(env.getProperty("hive.user"));
        dataSource.setPassword(env.getProperty("hive.password"));
        log.debug("Hive DataSource Inject Successfully...");
        return dataSource;
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate(@Qualifier("hiveJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}

