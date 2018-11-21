package com.ke.qa.mockserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ImportResource({"classpath:spring/spring.xml"}) 若存在spring.xml,可以使用此种方式注入
@SpringBootApplication
public class LinkDubboMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkDubboMockApplication.class, args);
	}
}
