package com.spring.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class ExampleBean {
	public ExampleBean(){
		System.out.println("ʵ����ExampleBean");
	}
	public void excute(){
		System.out.println("ִ��ExampleBean����");
	}
	@PostConstruct
	public void init(){
		System.out.println("��ʼ��ExampleBean����");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("����ExampleBean����");
	}
	
}
