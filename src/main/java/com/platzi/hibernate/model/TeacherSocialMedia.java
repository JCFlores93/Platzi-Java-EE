package com.platzi.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_social_media")
public class TeacherSocialMedia implements Serializable{
	
	@Id
	@Column(name="id_teacher_social_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	
	private Teacher teacher;
	private SocialMedia socialMedia;
	
	public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia) {
		super();
		this.teacher = teacher;
		this.socialMedia = socialMedia;
	}
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}
	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}		
}
