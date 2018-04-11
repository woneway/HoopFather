package com.woneway.domain;

import java.sql.Date;

public class Skill {
	private String skillId;
	private String skillTitle;
	private String skillLink;
	private Date skillDate;
	private String skillDesc;
	private String skillPoster;
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public String getSkillTitle() {
		return skillTitle;
	}
	public void setSkillTitle(String skillTitle) {
		this.skillTitle = skillTitle;
	}
	public String getSkillLink() {
		return skillLink;
	}
	public void setSkillLink(String skillLink) {
		this.skillLink = skillLink;
	}
	public Date getSkillDate() {
		return skillDate;
	}
	public void setSkillDate(Date skillDate) {
		this.skillDate = skillDate;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public String getSkillPoster() {
		return skillPoster;
	}
	public void setSkillPoster(String skillPoster) {
		this.skillPoster = skillPoster;
	}
	
}
