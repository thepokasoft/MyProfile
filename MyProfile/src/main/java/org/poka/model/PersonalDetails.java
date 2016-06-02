package org.poka.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.Beta;
import org.springframework.stereotype.Repository;

@XmlRootElement
public class PersonalDetails {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private List<Recommendations> recommedations;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<Recommendations> getRecommedations() {
		return recommedations;
	}
	public void setRecommedations(List<Recommendations> recommedations) {
		this.recommedations = recommedations;
	}
	
	public PersonalDetails(){
		/*this.firstName = "firstName";
		this.lastName = "lastName";
		this.email = "email";
		this.mobile = "mobile";*/
	};
	//Recommendations recommend; 
	public PersonalDetails(String firstName, String lastName, String email,
			String mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		List<Recommendations> recomend = new ArrayList<Recommendations>();
		recomend.add(new Recommendations("Dhyanesh","t.dhyanesh@gmail.com","This is a recommendtaion for Dhyanesh"));
		//System.out.println(recomend);
		this.recommedations = recomend;
	}
	

	

	
}
