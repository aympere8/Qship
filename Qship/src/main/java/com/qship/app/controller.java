package com.qship.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping("/l")
	public String s()
	{
		
		return "lmee.html";
	}
	@RequestMapping("managerlogin")
	public String sads()
	{
		return "managerlogin";
	}
	

	//@RequestMapping("logadmin")
	//public String las()
	//{
	//	return "admindeck.html";
	//}
	@RequestMapping("managerdeck")
	public String lolasdda()
	{
		return "managerdeck";
	}
	//@RequestMapping("adminlogin")
	//public String lolasd()
	//{
	//	return "adminlogin.html";
	//}
	
	@RequestMapping("validadmin")
	public String admintest (Logcred lc)
	{ String us=lc.getUsername();
	String ps= lc.getPass();
	if(us=="admin" && ps=="iamadmin")
		return "admindeck";
	else 
		return "adminlogin";
		
	}
	@RequestMapping("logout")
	public String lol(){
		return "index";
	}
	

}
