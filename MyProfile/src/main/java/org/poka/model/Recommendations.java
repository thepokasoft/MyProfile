package org.poka.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Repository;

@XmlRootElement
public class Recommendations {
	
	private String name;
	private String email;
	private String detail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	 public Recommendations() {};
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Recommendations(String name, String email, String detail) {
		this.name = name;
		this.email= email;
		this.detail = detail;
	}
	
	@Override
	public String toString()
	{
		return name+" "+email+" "+detail;
	}
	
}