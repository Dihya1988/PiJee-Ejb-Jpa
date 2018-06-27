package com.esprit.entities;
// Generated 27 juin 2018 23:49:29 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Customuserlogins generated by hbm2java
 */
@Entity
@Table(name = "customuserlogins", catalog = "bdnetjee")
public class Customuserlogins implements java.io.Serializable {

	private Integer id;
	private Users users;
	private String loginProvider;
	private String providerKey;
	private int userId;

	public Customuserlogins() {
	}

	public Customuserlogins(int userId) {
		this.userId = userId;
	}

	public Customuserlogins(Users users, String loginProvider, String providerKey, int userId) {
		this.users = users;
		this.loginProvider = loginProvider;
		this.providerKey = providerKey;
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_idUser")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "LoginProvider")
	public String getLoginProvider() {
		return this.loginProvider;
	}

	public void setLoginProvider(String loginProvider) {
		this.loginProvider = loginProvider;
	}

	@Column(name = "ProviderKey")
	public String getProviderKey() {
		return this.providerKey;
	}

	public void setProviderKey(String providerKey) {
		this.providerKey = providerKey;
	}

	@Column(name = "UserId", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}