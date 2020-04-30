package com.qship.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class Dbcont {
	
	@Autowired
	Dbdo dbdo;
	@Autowired
	Dbtrdo trdo;
	@RequestMapping("eadata")
	public String eadata(Employee emp)
	{
		dbdo.save(emp);
		return "admindeck";
		
	}
	@RequestMapping("tadata")
	public String tadata(T_rucks trux)
	{
		trdo.save(trux);
		return "admindeck";
		
	}
	@RequestMapping("dedata")
	public String dedata(Integer deid)
	{
		dbdo.deleteById(deid);
		return "admindeck";
		
	}
	@RequestMapping("dtdata")
	public String dtdata(Integer dtid)
	{
		trdo.deleteById(dtid);
		return "admindeck";
		
	}
	
	@RequestMapping("fetchemp")
	public ModelAndView fetchemp(ModelAndView mod)
	{
		mod.addObject("list",dbdo.findAll());
		mod.setViewName("empop");
		return mod;
	
	}
	
	
	
	@RequestMapping("fetchtrx")
	public ModelAndView fetchtrx(ModelAndView mod)
	{
		
		mod.addObject("list",trdo.findAll());
		mod.setViewName("trxpop");
		return mod;
		
	}

}
