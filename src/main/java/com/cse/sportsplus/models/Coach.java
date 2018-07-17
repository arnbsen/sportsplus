package com.cse.sportsplus.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tbl_coach")

public class Coach implements Serializable {

	
	
	@Column(name="group_id", columnDefinition="BIGINT(255) references group_tbl(groupid)")
	private Long group_id;
	
	@Id
	@GeneratedValue
	@Column(name="coach_id")
	private Long coach_id;
	
	@ManyToMany
	@JoinColumn(name = "groupID")
	private List<Group> groups;
	
	@Column(name="name")
	private String name;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="phone")
	private String phone;
	
	public Coach() {
		super();
	}

	public Long getCoach_id() {
		return coach_id;
	}

	public void setCoach_id(Long coach_id) {
		this.coach_id = coach_id;
	}


	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public Coach(Long group_id, String name, String qualification, String phone) {
//		super();
//		this.group_id = group_id;
//		this.name = name;
//		this.qualification = qualification;
//		this.phone = phone;
//	}

	public Coach(Long coach_id, Long group_id, String name, String qualification, String phone) {
		super();
		this.coach_id = coach_id;
		this.group_id = group_id;
		this.name = name;
		this.qualification = qualification;
		this.phone = phone;
	}
	
	

}