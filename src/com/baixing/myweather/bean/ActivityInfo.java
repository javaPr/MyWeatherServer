package com.baixing.myweather.bean;

public class ActivityInfo {
	private String title;
	private String editor;
	private String details;
	private String posttime;
	private String starttime;
	private int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getPosttime() {
		return posttime;
	}
	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ActivityInfo [title=" + title + ", editor=" + editor + ", details=" + details + ", posttime=" + posttime
				+ ", starttime=" + starttime + ", id=" + id + "]";
	}
	 
	

}
