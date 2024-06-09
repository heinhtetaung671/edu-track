package com.jdc.edu.domain.entity.account;

import java.util.List;

import com.jdc.edu.domain.entity.course.StudentCourse;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends AbstractLoginUser{
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
	private List<StudentCourse> studentCourses;
	
}
