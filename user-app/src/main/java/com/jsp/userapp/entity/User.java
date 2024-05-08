package com.jsp.userapp.entity;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Component
@Table(name = "user_table")
@Getter
@Setter
@NoArgsConstructor
@Validated
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 4,max = 20)
	private String name;
	@Email(message = "not correct email")
	private String email;
	@Max(9999999999l)
	@Min(600000000l)
	private long phone;
	@Pattern(regexp = "[0-9,a-z]{8}")
	private String password;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
