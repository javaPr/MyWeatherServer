package com.baixing.myweather.bean;

public class Activity {
	private String name;
	private String content;
	private String time;
	
	public Activity(){
		
	}
	
	public Activity(String name, String content, String time) {
		super();
		this.name = name;
		this.content = content;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	

}
