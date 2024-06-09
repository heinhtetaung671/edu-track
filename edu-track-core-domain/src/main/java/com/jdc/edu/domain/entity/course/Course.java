package com.jdc.edu.domain.entity.course;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.ColumnDefault;

import com.jdc.edu.domain.constant.CourseDeliveryMethod;
import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
	
	@Column(nullable = false)
	private short studentCapacity;
	
	private String remark;
	
	@ManyToOne(optional = false)
	private Category category;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	private List<StudentCourse> studentCourses;
	
}
