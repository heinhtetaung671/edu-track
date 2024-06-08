package com.jdc.edu.domain.entity.account;

import java.util.UUID;

import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractLoginUser extends AbstractEntity{

	@Id
	private UUID id;
	
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String phone;
	
	@OneToOne(optional = false)
	@MapsId
	@JoinColumn(name = "id")
	private Account account;
	
}
