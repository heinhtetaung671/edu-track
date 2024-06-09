package com.jdc.edu.domain.entity.account;

import java.util.UUID;

import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "login_user", indexes = { 
		@Index(name = "login_user_email_unique_idx", columnList = "email", unique = true),
		@Index(name = "login_user_phone_unique_idx", columnList = "phone", unique = true) })
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractLoginUser extends AbstractEntity {

	@Id
	private UUID id;

	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "phone", nullable = false)
	private String phone;

	@OneToOne(optional = false)
	@MapsId
	@JoinColumn(name = "id") /* To be able to reference from child class */
	private Account account;

}
