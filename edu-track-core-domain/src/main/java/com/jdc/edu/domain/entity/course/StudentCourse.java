package com.jdc.edu.domain.entity.course;

import com.jdc.edu.domain.entity.AbstractEntity;
import com.jdc.edu.domain.entity.account.Student;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentCourse extends AbstractEntity{
	
	@EmbeddedId
	private StudentCoursePk id;
	
	@MapsId(value = "studentId")
	@ManyToOne(optional = false)
	private Student student;

	@MapsId(value = "courseId")
	@ManyToOne(optional = false)
	private Course course;
	
}
