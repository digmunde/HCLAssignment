package com.hcl.model;

import java.time.LocalDate;

public class Candidate {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Integer noOfVotes;
	private String region;

	public Candidate(String firstName, String lastName, LocalDate dob, Integer noOfVotes, String region) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.noOfVotes = noOfVotes;
		this.region = region;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getNoOfVotes() {
		return noOfVotes;
	}

	public void setNoOfVotes(Integer noOfVotes) {
		this.noOfVotes = noOfVotes;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", noOfVotes="
				+ noOfVotes + ", region=" + region + "]";
	}

}
