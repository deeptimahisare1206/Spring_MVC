package com.mypackage;

//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	

	@RequestMapping("/info")
	@ResponseBody
	String get2() {
		
		return "First";
	}
	

	
//	@RequestMapping("/insert2")
//	String insert(@ModelAttribute Student student) {
//		
//		return "Insert";
//	}
//	
		
		
}
	
	
	
	
