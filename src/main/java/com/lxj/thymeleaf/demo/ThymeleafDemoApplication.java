package com.lxj.thymeleaf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxj.thymeleaf.demo.mapper")
public class ThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
		System.out.println( "\n (♥◠‿◠)ﾉﾞ  ThymeleafDemoApplication 启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
	}

}

