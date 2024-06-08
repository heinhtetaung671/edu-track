package com.jdc.edu.domain.entity.account;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends AbstractLoginUser{

	
	
}
