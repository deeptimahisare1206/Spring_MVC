package com.mypackage;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/one")
	@ResponseBody
	String get() {
		
		return "Controller Class Displayed!";
	}
	

	@RequestMapping("/two")
//	@ResponseBody
	String get2() {
		
		return "First";
	}
	
	
//	@RequestMapping("/insert")
//	String insert(HttpServletRequest req ,Model m) {
//		
//		String roll = req.getParameter("roll");
//		String name = req.getParameter("name");
//		String per = req.getParameter("per");
//		
//		
//		
//		m.addAttribute("roll", roll);
//		m.addAttribute("name", name);
//		m.addAttribute("per", per);
//		
//		return "Insert";
//	}
	
//=============================================================================================================	
	
	//Method 2
	
//	@RequestMapping("/insert2")
//	ModelAndView insert(HttpServletRequest req ,ModelAndView mv) {
//		
//		String roll = req.getParameter("roll");
//		String name = req.getParameter("name");
//		String per = req.getParameter("per");
//		
//		
//		
//		mv.addObject("roll", roll);
//		mv.addObject("name", name);
//		mv.addObject("per", per);
//		mv.setViewName("Insert");
//		
//		return mv;
//	}
	
	
	
	//=============================================================================================================	
	
		//Method 3
	
	@RequestMapping("/insert2")
	String insert(@ModelAttribute Student student) {
		
		return "Insert";
	}
	
		
		
}
	
	
	
	
