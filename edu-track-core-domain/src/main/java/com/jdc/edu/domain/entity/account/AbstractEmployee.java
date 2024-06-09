package com.jdc.edu.domain.entity.account;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
public class AbstractEmployee extends AbstractLoginUser {

	@Embedded
	private EmployeeInfo employeeInfo;
	
	@PrePersist
	@PreUpdate
	public void prePersistAndUpdate() {
		if(null == employeeInfo) {
			throw new PersistenceException("employeeInfo is Null!");
		}
		
		employeeInfo.determineEmployeeStatusAndSetDate();
	}
	
}
