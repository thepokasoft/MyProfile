package org.poka;

import org.poka.service.PersonalDetailsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMail {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PersonalDetailsService pds = (PersonalDetailsService) context.getBean("personalDetailsService");
		
		System.out.println(pds.getDetails().getFirstName());

	}

}
