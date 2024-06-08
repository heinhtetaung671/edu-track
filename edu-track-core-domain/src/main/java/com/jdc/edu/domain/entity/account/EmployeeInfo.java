package com.jdc.edu.domain.entity.account;

import java.io.Serializable;
import java.time.LocalDate;

import com.jdc.edu.domain.constant.EmployeeStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PersistenceException;
import lombok.Data;

@Embeddable
@Data
public class EmployeeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private LocalDate assignAt;
	private LocalDate permanentAt;
	private LocalDate resignAt;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;

	public void determineEmployeeStatusAndSetDate() {
		switch (employeeStatus) {
		case null -> throw new PersistenceException("employeeStatus is Null!");
		case PROVATION -> this.assignAt = LocalDate.now();
		case PERMANENT -> this.permanentAt = LocalDate.now();
		case RESIGN -> this.resignAt = LocalDate.now();
		}
	}

}
