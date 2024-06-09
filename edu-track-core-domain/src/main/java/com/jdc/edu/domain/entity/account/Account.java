package com.jdc.edu.domain.entity.account;

import java.util.UUID;

import com.jdc.edu.domain.constant.AccountRole;
import com.jdc.edu.domain.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(indexes = { @Index(name = "account_username_idx", columnList = "username", unique = true ) })
@Data
@EqualsAndHashCode(callSuper = false)
public class Account extends AbstractEntity{
 
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "username", nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private AccountRole accountRole;
	
	@OneToOne(mappedBy = "account")
	private AbstractLoginUser loginUser;
	
}
