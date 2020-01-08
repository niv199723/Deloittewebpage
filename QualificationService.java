package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QualificationDAO;
import com.example.demo.model.ProjectDetails;
import com.example.demo.model.Qualification;


@Service

public class QualificationService {
	@Autowired
    QualificationDAO dao;
	public String adddata(Qualification qua,ProjectDetails pd) {
		String msg = dao.adddata(qua,pd);
		System.out.println(msg);
		return msg;
	}
	public ArrayList<Qualification> display() {
		return dao.display();
	}

}
