package com.jdc.edu.domain.entity.course;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import com.jdc.edu.domain.constant.CourseDeliveryMethod;
import com.jdc.edu.domain.entity.AbstractEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = { @Index(name = "course_name_unique_idx", columnList = "name, batch, deliveryMethod", unique = true) })
@Data
@EqualsAndHashCode(callSuper = false)
public class Course extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "batch", nullable = false)
	private short batch;

	@Enumerated(EnumType.STRING)
	@Column(name = "deliveryMethod", nullable = false)
	private CourseDeliveryMethod deliveryMethod;

	@ColumnDefault("0")
	@Column(nullable = false)
	private BigDecimal fees;

	@ManyToOne(optional = false)
	private Category category;

	@ManyToOne(optional = false)
	private TimeTable timeTable;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "course")
	private CourseAdditionalInfo courseAdditionalInfo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	private List<StudentCourse> studentCourses;
	
}
