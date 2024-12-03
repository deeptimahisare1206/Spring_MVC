package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mydao.StudentDao;

@Controller
public class MyController {
	
	@Autowired
	StudentDao studentDao;
	

	@RequestMapping("/info")
//	@ResponseBody
	String get2() {
		
		return "First";
	}
	
	@RequestMapping("/insert2")
	public String insert(@ModelAttribute Student student) {
		studentDao.insert(student);
		return "Insert_data";
		
	}
	@RequestMapping("/selecta")
	public String selectAll(@ModelAttribute Student student) {
		studentDao.selectAll(student);
		return "Insert_data";
		
	}
	
	

}
