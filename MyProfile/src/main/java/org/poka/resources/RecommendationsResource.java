package org.poka.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import org.poka.model.Recommendations;
import org.poka.service.PersonalDetailsService;
import org.springframework.stereotype.Component;

@Component
@Path("/recommendations")
public class RecommendationsResource {
	
	PersonalDetailsService personalDetailsService = new PersonalDetailsService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Recommendations> getRecommendations()
	{
		return personalDetailsService.getDetails().getRecommedations();
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Recommendations setRecommendations(Recommendations recommend)
	{
		List<Recommendations> recommedations = personalDetailsService.getDetails().getRecommedations();//PersonalDetailsService.getDetails().getRecommedations();
		recommedations.add(recommend);
		personalDetailsService.getDetails().setRecommedations(recommedations);	
		return recommend;
	}
}
