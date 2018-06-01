package com.jason.shop.authentication.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatasourceConfig {
	private Logger logger = LoggerFactory.getLogger(DatasourceConfig.class);
	
    @Resource
    private DuridConfigProperties duridConfigProperties;

    @Bean(name="dataSource",destroyMethod = "close", initMethod="init")
    @Primary //不要漏了这
    public DataSource dataSource(){  
        DruidDataSource datasource = new DruidDataSource();  
        try {  
	        datasource.setUrl(duridConfigProperties.getUrl());
	        datasource.setDbType(duridConfigProperties.getType());
	        datasource.setUsername(duridConfigProperties.getUsername());
	        datasource.setPassword(duridConfigProperties.getPassword());
	        datasource.setDriverClassName(duridConfigProperties.getDriverClassName());
	        datasource.setInitialSize(duridConfigProperties.getInitialSize());
	        datasource.setMinIdle(duridConfigProperties.getMinIdle());
	        datasource.setMaxActive(duridConfigProperties.getMaxActive());
	        datasource.setMaxWait(duridConfigProperties.getMaxWait());
	        datasource.setTimeBetweenEvictionRunsMillis(duridConfigProperties.getTimeBetweenEvictionRunsMillis());
	        datasource.setMinEvictableIdleTimeMillis(duridConfigProperties.getMinEvictableIdleTimeMillis());
	        datasource.setValidationQuery(duridConfigProperties.getValidationQuery());
	        datasource.setTestWhileIdle(duridConfigProperties.isTestWhileIdle());
	        datasource.setTestOnBorrow(duridConfigProperties.isTestOnBorrow());
	        datasource.setTestOnReturn(duridConfigProperties.isTestOnReturn());
	        datasource.setPoolPreparedStatements(duridConfigProperties.isPoolPreparedStatements());
            datasource.setFilters(duridConfigProperties.getFilters());
        } catch (SQLException e) {  
            logger.error("druid configuration initialization filter", e);  
        }  
        return datasource;  
    }
}