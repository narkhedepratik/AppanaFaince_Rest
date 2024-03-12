package com.appana_fainance.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appana_fainance.main.model.Enquiry;

@RestController
public class EnquiryController {
	
	
	
	@PostMapping("/enquiry")
   public Enquiry createEnquiry(@RequestBody Enquiry enquiry)
   {
		return enquiry;
   }
	@GetMappling("/enquiry")
	public List<Enquiry> allEnquiry()
	{
		return null;

	}
	

}
