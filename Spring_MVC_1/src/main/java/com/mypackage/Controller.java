package com.mypackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
