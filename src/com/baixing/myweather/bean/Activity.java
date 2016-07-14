package com.baixing.myweather.bean;

public class Activity {
	private String editor;
	private String details;
	private String title = "";
	private String starttime;
	
	public Activity() {
		super();
	}



	public Activity(String editor, String details, String starttime) {
		super();
		this.editor = editor;
		this.details = details;
		this.title = "";
		this.starttime = starttime;
	}



	public String getEditor() {
		return editor;
	}



	public void setEditor(String editor) {
		this.editor = editor;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getStarttime() {
		return starttime;
	}



	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	
	
	

}
