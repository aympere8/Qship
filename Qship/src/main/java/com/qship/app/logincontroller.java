package com.qship.app;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class logincontroller {
	@RequestMapping("adminlogin")
	public String adminlog()
	{
		return "adminlogin.html";
		
	}
	
	@RequestMapping("logadmin")
	  public String submit( Logcred log) {
	    if (log != null && log.getUsername() != null & log.getPass() != null) {
	      if (log.getUsername().equals("admin") && log.getPass().equals("iamadmin")) {
	       
	        return "admindeck.html";
	      } else {
	       
	        return "adminlogin.html";
	      }
	    } else {
	     
	      return "adminlogin.html";
	    }
	

}
	
}
