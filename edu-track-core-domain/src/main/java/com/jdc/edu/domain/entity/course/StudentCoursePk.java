package com.jdc.edu.domain.entity.course;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class StudentCoursePk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "student_id")
	private UUID studentId;
	@Column(name = "course_id")
	private UUID courseId;
	
}
