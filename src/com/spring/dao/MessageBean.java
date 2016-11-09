package com.spring.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean {
	private String name;
	private String password;
	private String phone;
	private String gender;
	private List<String> list;
	private Set<String> set;
	private Map<String,Object>map;
	private Properties properties;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void excute(){
		System.out.println("name="+name);
		System.out.println("password="+password);
		System.out.println("phone="+phone);
		System.out.println("gender="+gender);
		System.out.println("----------------list信息-----------------");
		/*
		 * list集合
		 */
		for(String s:list){
			System.out.println(s);
		}
		System.out.println("-----------------set信息------------------");
		/*
		 * set集合
		 */
		for(String s:set){
			System.out.println(s);
		}
		System.out.println("-------------------map信息------------------");
		/*
		 * 循环key取出map value值
		 */
		Set<String> key = map.keySet();
		for(String s:key){
			System.out.println(s+"="+map.get(s));
		}
		System.out.println("--------------------properties信息--------------");
		/*
		 * properties
		 */
		Set<Object> set = properties.keySet();
		for(Object o:set){
			System.out.println(o+"="+properties.getProperty(o.toString()));
		}
	}
}
