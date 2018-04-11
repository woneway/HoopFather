package com.woneway.domain;

import java.sql.Date;

public class News {
	private String newsId;
	private String newsTitle;
	private String newsContent;
	private String newsAuthor;
	private Date newsDate;
	private String newsPhoto;
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsAuthor() {
		return newsAuthor;
	}
	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}
	public Date getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}
	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getNewsPhoto() {
		return newsPhoto;
	}
	public void setNewsPhoto(String newsPhoto) {
		this.newsPhoto = newsPhoto;
	}
	
	
}
