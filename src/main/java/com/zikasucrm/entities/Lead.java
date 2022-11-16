package com.zikasucrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "Leads")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "this field cannot empty")
	@Column(name="first_name",length=30)
	private String firstName;
	
	@NotEmpty(message = "this field cannot empty")
	@Column(name="last_name",length=30)
	private String lastName;
	
	@NotEmpty(message="this field cannot be empty")
	@Min(10)
	@Column(name="mobile",length=10,unique=true)
	private long mobile;
	
	@Email
	@NotEmpty(message="this field cannot be empty")
	@Column(name="email",length=50,unique=true)
	private String email;
	
	private String source;
	
	
	public long getId() {
		return id;
		
	}
	public void setId(long id) {
			this.id = id;
		}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	
}
