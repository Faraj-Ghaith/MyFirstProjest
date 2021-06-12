package com.example.demo;


import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="user")
@Table(name="users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class user implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String password2;
	@Column
	private boolean verficated;
	@Column
	 ArrayList<Integer> moaamlatId;

	
	
	public ArrayList<Integer> getMoaamlatId() {
		return moaamlatId;
	}

	public void setMoaamlatId(ArrayList<Integer> moaamlatId) {
		this.moaamlatId = moaamlatId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public user() {}
	
	public user( String username, String email,  String password) {
		
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "useer [id=" + id + "email=" + email + ", password=" + password + "]";
	}

	public boolean isVerficated() {
		return verficated;
	}

	public void setVerficated(boolean verficated) {
		this.verficated = verficated;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password) {
		this.password2 = password;
	}
	
	
	
}
