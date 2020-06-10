package com.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})//让多数据源依赖冲突的问题得到解决，就是按类型注入的时候不会发现多个datasource
public class MultiDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiDataSourceApplication.class, args);
	}

}
