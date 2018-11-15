package com.accp.entity;

import com.accp.annotation.Column;
import com.accp.annotation.Table;

@Table("students")
public class Student {
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="sex")
	private String sex;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString() {
		return "{id:"+this.id+",name:\""+this.name+"\",age:"+this.age+",sex:\""+this.sex+"\"}";
	}
	
}
