package org.poka.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.poka.model.PersonalDetails;
import org.poka.model.Recommendations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsService {

	private PersonalDetails personalDetails;
	
	public PersonalDetailsService()
	{
	 personalDetails = new PersonalDetails("Dhyanesh", "Thatchinamoorthy", "t.dhyanesh@gmailcom", "9902296655");
	 System.out.println(" Initializing details.");
	 //Recommendations recommend = new Recommendations("Dhyanesh","t.dhyanesh@gmail.com","This is a recommendtaion for Dhyanesh");
	 //List<Recommendations> recomend = new ArrayList<Recommendations>();
	 //recomend.add(recommend);
	 //System.out.println(recomend);
	 //personalDetails.setRecommedations(recomend);
	}
	
	/*@Autowired
	private PersonalDetails personalDetails;*/
	
	public PersonalDetails getDetails() {
		//PersonalDetails details = new PersonalDetails("Dhyanesh", "Thatchinamoorthy", "t.dhyanesh@gmailcom", "9902296655");
		return personalDetails;
	}
	
	public void setDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
	
	
}
