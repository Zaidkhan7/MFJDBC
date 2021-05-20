 package com.ncu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.jdbc.UserDao;
import com.ncu.model.ModelDemo;

@Controller
@SessionAttributes("modeldemo")
public class ControllerDemo {

	@Autowired
	private UserDao userdao;
	
	@ModelAttribute("modeldemo")
	public ModelDemo Setupform()
	{
		return new ModelDemo();
	}
	@RequestMapping("/init")
	public String FirstPage(Model model,@ModelAttribute("modeldemo") ModelDemo modeldemo) {
		model.addAttribute("msg",new ModelDemo());
		return "Pageone";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String DoLogin(Model model,@ModelAttribute("modeldemo")ModelDemo modeldemo)
	{
		try {
		userdao.add(modeldemo);
				
		}catch(Exception e) {System.out.println(e);};
		
		return "Pagetwo";
	}
	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String userinfo(@SessionAttribute("modeldemo") ModelDemo modeldemo)
	{
		
		return "Pagethree";
	}
}
