package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDAO;
import com.example.demo.dao.ProjectDAO;
import com.example.demo.model.ProjectDetails;
import com.example.demo.model.User;
@Service
public class ProjectService {
	@Autowired
	ProjectDAO dao;
	public void addUser(ProjectDetails pd) {
		// TODO Auto-generated method stub
		dao.addUser(pd);
	}
	public ArrayList<ProjectDetails> getMessage(){
		return dao.displayPerDet();
	}
	public String addFresher(ProjectDetails pd) {
		return dao.addFresher(pd);
	}
	public ArrayList<ProjectDetails> display1(){
		return dao.display1();
}
	
}
