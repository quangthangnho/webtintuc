package com.websitetintuc.model;

public class Comment extends AbstractModel{
	private String content;
	private long user_Id;
	private long new_Id;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}
	public long getNew_Id() {
		return new_Id;
	}
	public void setNew_Id(long new_Id) {
		this.new_Id = new_Id;
	}
	
}
