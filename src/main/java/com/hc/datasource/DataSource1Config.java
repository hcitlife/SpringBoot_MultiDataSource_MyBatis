package com.hc.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration // 注册到springboot容器中
@MapperScan(basePackages = "com.hc.test1.mapper", sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSource1Config {

    /**
     * 创建数据源
     * @return
     */
    @Bean(name = "test1DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 创建会话工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "test1SqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
//		bean.setMapperLocations(
//				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return factory.getObject();
    }

    /**
     * 创建模板
     * @param sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean(name = "test1SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     * 创建事物管理
     * @param dataSource
     * @return
     */
    @Bean(name = "test1TransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
