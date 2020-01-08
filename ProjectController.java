package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ProjectDetails;
import com.example.demo.model.Qualification;
import com.example.demo.model.User;
import com.example.demo.services.DemoDervice;
import com.example.demo.services.ProjectService;
import com.example.demo.services.QualificationService;
@Controller
@ResponseBody
public class ProjectController {
    @Autowired
    ProjectService service;
    @Autowired
    QualificationService Quaservice;
//	@GetMapping("/nivi")
//	public ArrayList<User> getUserid(@RequestParam("userId") String userId) {
//		return service.getUserid(userId);
//	}
	@RequestMapping("/personalDetails")
	public ModelAndView myPersonal() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("personal");
		//modelAndView.addObject("NewFile", service.getMessage());
		return modelAndView;
	}
    
    @GetMapping
    public ArrayList<ProjectDetails> getMessage(){
    	return service.getMessage();
    }
	@PostMapping("/submit")
	public ModelAndView myQualification(ProjectDetails pd) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(pd);
		modelAndView.setViewName("qualification");
		modelAndView.addObject("user", pd);
		
		return modelAndView;
	}
	
	@GetMapping("/quasubmit/{id}/{email}/{name}/{fathername}/{mothername}/{address}/{contactno}/{gender}/{password}")
	public ModelAndView quaSubmit(@PathVariable("id") int userid,@PathVariable("email") String emailid,@PathVariable("name") String name,@PathVariable("fathername") String fathername,@PathVariable("mothername") String mothername,@PathVariable("address") String address,@PathVariable("contactno") long contactno,@PathVariable("gender") String gender,@PathVariable("password") String password,
			@RequestParam("qualification") String qualification,@RequestParam("finalPercentage") int finalPercentage,@RequestParam("interviewScore") int interviewScore,@RequestParam("technicalScore") int technicalScore,@RequestParam("communicationScore") int communicationScore)
	
	{
		Qualification qua = new Qualification();
		qua.setQualification(qualification);
		qua.setFinalPercentage(finalPercentage);
		qua.setInterviewScore(interviewScore);
		qua.setTechnicalScore(technicalScore);
		qua.setCommunicationScore(communicationScore);
		
		System.out.println("Qualification "+qua);
		ProjectDetails pd=new ProjectDetails();
		pd.setUserid(userid);
		pd.setEmailid(emailid);
		pd.setName(mothername);
		pd.setFathername(fathername);
		pd.setMothername(mothername);
		pd.setAddress(address);
		pd.setContactno(contactno);
		pd.setGender(gender);
		pd.setPassword(password);
		System.out.println("personal detaiils "+pd);
		ModelAndView modelAndview=new ModelAndView();
		System.out.println(userid);
		modelAndview.setViewName("qualification");
		//modelAndview.addObject("test", service.addFresher(pd));
		String message=Quaservice.adddata(qua,pd);
		modelAndview.addObject("data",message);
		System.out.println(message);
		return modelAndview;
	}
	
	@GetMapping("/hey")
	public ModelAndView myMethod3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("personalDisplay");
		//modelAndView.addObject("NewFile", service.getMessage());
		return modelAndView.addObject("display",service.display1());
	}
	
	
	
}