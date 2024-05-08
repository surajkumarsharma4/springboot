package com.jsp.jsonexamples.entity;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private List list;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	private Subject subject;
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
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
}
