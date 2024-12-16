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
	public String insert(@ModelAttribute Student student) {
		studentDao.insert(student);
		return "redirect:/selecta";
		
	}
	@RequestMapping("/selecta")
	public String selectAll(Model mod) {
		List<Student> list = studentDao.selectAll();
		mod.addAttribute("studentss",list);
		return "Insert_data";
	
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") Integer id, HttpServletResponse res) {
		Student st =studentDao.findbyId(id);
		studentDao.delete(st);
		return "redirect:/selecta";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") Integer id,Model m) {
		Student st =studentDao.findbyId(id);
		m.addAttribute("getup", st);
		
		return "update";
	}
	@RequestMapping("/updated")
	public String updated(@ModelAttribute Student student) {
		studentDao.update(student);
		return "redirect:/selecta";
		
	}
	
	

}
