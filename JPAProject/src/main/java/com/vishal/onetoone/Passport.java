package com.vishal.onetoone;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	@Column(name="passport_no")
	int passportNumber;
	
	@Column(name="passport_holder")
	String passportHolderName;
	
	@Column(name="dob")
	LocalDate dateOfBirth;
	
	@Column(name="issueDate")
	LocalDate passportIssuedOn;
	
	@Column(name="expiryDate")
	LocalDate passportExpiryOn;

	@OneToOne(mappedBy="passport")
	Employee employee; //hasA
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportHolderName() {
		return passportHolderName;
	}

	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getPassportIssuedOn() {
		return passportIssuedOn;
	}

	public void setPassportIssuedOn(LocalDate passportIssuedOn) {
		this.passportIssuedOn = passportIssuedOn;
	}

	public LocalDate getPassportExpiryOn() {
		return passportExpiryOn;
	}

	public void setPassportExpiryOn(LocalDate passportExpiryOn) {
		this.passportExpiryOn = passportExpiryOn;
	}
	
	
	
	
	
}

