package com.mycompany;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mydao.StudentDao;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
	public String insert(@ModelAttribute Student student , HttpServletResponse res) {
		studentDao.insert(student);
		try {
			res.sendRedirect("Insert_data");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Insert_data";
		
	}
	@RequestMapping("/selecta")
	public String selectAll(Model mod) {
		List<Student> list = studentDao.selectAll();
		mod.addAttribute("studentss",list);
		return "Insert_data";
	
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam("id") Student student) {
		studentDao.delete(student);
		return "Success";
	}
	
//	
//	@RequestMapping("/test")
//	@ResponseBody
//	public String test(HttpServletRequest req, Model m) {
//		String id = req.getParameter("id");
//		System.out.println(id);
//		return "Success";
//	}
//	
	
	

}
