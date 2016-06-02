package org.poka.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.poka.model.PersonalDetails;
import org.poka.model.Recommendations;
import org.poka.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/personaldetails")
public class PersonalDetailsResource {
	
	//PersonalDetails details = new PersonalDetails("Dhyanesh", "Thatchinamoorthy", "t.dhyanesh@gmailcom", "9902296655");
	static PersonalDetailsService personalDetailsService;
	 public PersonalDetailsResource(){
		 personalDetailsService= new PersonalDetailsService();
	 }
	
	/*@Autowired
	PersonalDetailsService personalDetailsService;*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PersonalDetails getDetails()
	{
		//return details;
		return personalDetailsService.getDetails();
	}


/* ===========================*/
	

	@Path("/recommendations")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Recommendations> getRecommendations()
	{
		return personalDetailsService.getDetails().getRecommedations();
	}

	@Path("/recommendations")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Recommendations setRecommendations(Recommendations recommend)
	{
		List<Recommendations> recommedations = personalDetailsService.getDetails().getRecommedations();//PersonalDetailsService.getDetails().getRecommedations();
		recommedations.add(recommend);
		//System.out.println(recommedations);
		personalDetailsService.getDetails().setRecommedations(recommedations);	
		return recommend;
	}
	
	
}
