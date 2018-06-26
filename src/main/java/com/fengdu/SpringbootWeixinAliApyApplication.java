package com.fengdu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
* <p>Title: SpringbootWeixinAliApyApplication.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author tiankong 
* @email 2366207000@qq.com
* @date 2018年6月26日  
* @version 1.0
 */
@SpringBootApplication
@MapperScan("com.fengdu.dao")
public class SpringbootWeixinAliApyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWeixinAliApyApplication.class, args);
	}
}
