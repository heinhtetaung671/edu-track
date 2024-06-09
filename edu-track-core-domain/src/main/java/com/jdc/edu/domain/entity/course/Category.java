package com.jdc.edu.domain.entity.course;

import java.util.List;
import java.util.UUID;

import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = { @Index(name = "category_name_idx", columnList = "name", unique = true) })
@Data
@EqualsAndHashCode(callSuper = false)
public class Category extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private List<Course> courses;
}
