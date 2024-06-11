package com.jdc.edu.domain.entity.attendance;

import java.io.Serializable;

import com.jdc.edu.domain.entity.enrollment.Enrollment;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class AttendancePk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(optional = false)
	private Enrollment enrollment;
	private long seq;
	
}
