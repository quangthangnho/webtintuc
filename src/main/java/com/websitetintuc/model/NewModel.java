package com.websitetintuc.model;

public class NewModel extends AbstractModel{
	private String title;
	private String thumbNail;
	private String softDescription;
	private String content;
	private long categoryId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbNail() {
		return thumbNail;
	}
	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}
	public String getSoftDescription() {
		return softDescription;
	}
	public void setSoftDescription(String softDescription) {
		this.softDescription = softDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
