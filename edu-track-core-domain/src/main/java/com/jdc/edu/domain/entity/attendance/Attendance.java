package com.jdc.edu.domain.entity.attendance;

import java.time.LocalDate;
import java.time.LocalTime;

import com.jdc.edu.domain.constant.AttendanceType;
import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = { @Index(name = "attendance_attendanceDate_idx", columnList = "attendanceDate", unique = false) })
@Data
@EqualsAndHashCode(callSuper = false)
public class Attendance extends AbstractEntity{
	
	@EmbeddedId
	private AttendancePk id;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AttendanceType type;
		
	@Column(name = "attendanceDate", nullable = false)
	private LocalDate attendanceDate;
	@Column(nullable = false)
	private LocalTime attendanceTime;
	
	private String remark;
	
}
